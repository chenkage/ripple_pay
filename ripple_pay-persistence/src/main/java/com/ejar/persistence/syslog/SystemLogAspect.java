package com.ejar.persistence.syslog;

import com.alibaba.fastjson.JSON;
import com.ejar.domain.model.OperationLog;
import com.ejar.persistence.mapper.OperationLogMapper;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 日志管理切点类
 *
 * @author ChenXY
 */
@Aspect
@Component
public class SystemLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);

    @Resource
    private OperationLogMapper operationLogMapper;

    /**
     * controller层切入点
     */
    @Pointcut("@annotation(com.ejar.persistence.syslog.SystemControllerLog)")
    public void controllerAspect() {
    }

    /**
     * 前置通知 用于拦截Controller层操作
     *
     * @param joinPoint 切点
     */
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                    .getRequestAttributes()).getRequest();
            // 可以获取登陆用户信息，设置日志对象操作人

            // 获取请求ip
            String ip = getRemoteHost(request);

            // 获取请求类型
            String type = request.getMethod();

            StringBuffer params = new StringBuffer();
            // 获取参数值
            Object[] args = joinPoint.getArgs();
            // 获取参数Key
            final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            final String[] parameterNames = signature.getParameterNames();
            if (args != null) {
                List<Object> list = Arrays.asList(args);
                for (int i = 0; i < list.size(); i++) {
                    try {
                        params.append(parameterNames[i] + "=" + (null == list.get(i) ? "null" : JSON.toJSON(list.get(i))).toString());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    params.append(",");
                }
            }
            String strParams = params.toString();
            if(StringUtils.isNotEmpty(strParams)) {
                strParams = strParams.substring(0, strParams.length() - 1);
                if(strParams.length() > 512){
                    strParams= strParams.substring(0,512);
                }
            }
//            strParams = strParams.substring(0,strParams.length()-1);
            OperationLog log = new OperationLog();
            log.setDescription(getControllerMethodDescription(joinPoint));
            log.setMethod((joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
            log.setReqType(type);
            log.setIp(ip);
            log.setParams(strParams);
            log.setCreateBy("test");
            log.setCreateTime(new Date());

            // 插入数据库
            operationLogMapper.insert(log);
            logger.info(JSON.toJSON(log).toString());
        } catch (Exception e) {
            // 记录本地异常日志
            logger.warn("异常信息:{}", e);
        }
    }

    /**
     * 获取注解中对方法的描述信息 用于Controller层注解
     *
     * @param joinPoint 切点
     * @return 方法描述
     * @throws Exception
     */
    private static String getControllerMethodDescription(JoinPoint joinPoint) {

        String description = "";
        try {
            Object object = joinPoint.getTarget();

            //获取方法名称
            String methodName = joinPoint.getSignature().getName();
            Class<?>[] parameterTypes = ((MethodSignature)joinPoint.getSignature()).getMethod().getParameterTypes();

            //获取到方法
            Method method = object.getClass().getMethod(methodName, parameterTypes);

            //获取注解中的值
            SystemControllerLog systemControllerLog = method.getAnnotation(SystemControllerLog.class);

            //获取注解值
            description = systemControllerLog.description();

        } catch (Exception e) {
            // 记录本地异常日志
            logger.warn("获取操作日志异常信息:{}", e);
        }
        return description;
    }

    /**
     * 获取客户端ip
     *
     * @param request
     * @return
     */
    private static String getRemoteHost(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
    }


}