package com.ejar.persistence.aspect;

import com.ejar.persistence.datasource.DataSource;
import com.ejar.persistence.datasource.DynamicRouteDataSource;
import com.ejar.common.objects.ThreadContext;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public final class DataSourceAspect {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private DataSourceSwitch dataSourceSwitch;

    public void setDataSourceSwitch(DataSourceSwitch dataSourceSwitch) {
        this.dataSourceSwitch = dataSourceSwitch;
    }

    public Object setDataSourceType(org.aspectj.lang.ProceedingJoinPoint joinPoint) throws Throwable {
        final MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        final Method method = joinPoint.getTarget().getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
        final DataSource dataSourceAnnotation = method.getAnnotation(DataSource.class);
        if (dataSourceAnnotation == null) {
            return joinPoint.proceed(joinPoint.getArgs());
        }
        final String targetName = dataSourceAnnotation.value().getTypeName();
        final DynamicRouteDataSource.DataSourceType switchTarget = dataSourceSwitch == null ? null:dataSourceSwitch.getSwitchTarget(targetName);
        final String targetLookupKey = switchTarget == null ? targetName:switchTarget.getTypeName();
        try {
            ThreadContext.put(DynamicRouteDataSource.THREAD_CONTEXT_DATA_SOURCE_KEY, targetLookupKey);
            return joinPoint.proceed(joinPoint.getArgs());
        }
        finally {
            ThreadContext.clear(DynamicRouteDataSource.THREAD_CONTEXT_DATA_SOURCE_KEY);
        }
    }
}