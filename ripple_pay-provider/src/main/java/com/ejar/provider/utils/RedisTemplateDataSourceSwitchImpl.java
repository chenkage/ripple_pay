package com.ejar.provider.utils;

import com.ejar.persistence.aspect.DataSourceSwitch;
import com.ejar.persistence.datasource.DynamicRouteDataSource;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * @Author chenka
 * @Description 数据库读写redis切换开关
 * @Date 9:47 2019/4/4
 * @Param
 * @return
 */
public class RedisTemplateDataSourceSwitchImpl implements DataSourceSwitch {
    @Resource
    private RedisTemplate redisTemplate;
    private static final String DATA_SOURCE_LOOKUP_KEY = "persistence:dynamic:lookupKey";

    @Override
    public DynamicRouteDataSource.DataSourceType getSwitchTarget(String targetName) {
        final String targetLookupKey = (String) redisTemplate.opsForHash().get(DATA_SOURCE_LOOKUP_KEY, targetName);
        return targetLookupKey == null ? null: DynamicRouteDataSource.DataSourceType.fromValue(targetLookupKey.trim());
    }
}
