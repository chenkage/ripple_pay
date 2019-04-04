package com.base.redis;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.*;

@Repository
public class JedisDataSourceImpl implements JedisDataSource {

    private static final Logger LOG = Logger.getLogger(JedisDataSourceImpl.class);

    @Autowired
    private ShardedJedisPool shardedJedisPool;

    @Override
    public ShardedJedis getRedisClient() {
        ShardedJedis jedis = null;
        try {
            jedis = shardedJedisPool.getResource();
            return jedis;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LOG.warn("[JedisDS] getRedisClent error:" + e.getMessage());
            if (null != jedis) {
                jedis.close();
            }
        }
        return null;
    }

    @Override
    public void returnResource(ShardedJedis shardedJedis) {
        shardedJedis.close();
    }

    @Override
    public void returnResource(ShardedJedis shardedJedis, boolean broken) {
        shardedJedis.close();
    }

}