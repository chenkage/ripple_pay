package com.base.redis;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.ShardedJedis;

@Repository
public class RedisClientTemplate {
    private static final Logger log = Logger.getLogger(RedisClientTemplate.class);

    @Autowired
    private JedisDataSource redisDataSource;

    public void disconnect() {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        ShardedJedis.disconnect();
    }

    /**
     * 设置单个值
     *
     * @param key
     * @param value
     * @return
     */
    public String set(String key, String value) {
        String result = null;

        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.set(key, value);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    /**
     * 设置单个值
     *
     * @param key
     * @param value
     * @return
     */
    public String set(byte[] key, byte[] value) {
        String result = null;

        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.set(key, value);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    /**
     * 获取单个值
     *
     * @param key
     * @return
     */
    public String get(String key) {
        String result = null;
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }

        boolean broken = false;
        try {
            result = ShardedJedis.get(key);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    /**
     * 获取单个值
     *
     * @param key
     * @return
     */
    public byte[] get(byte[] key) {
        byte[] result = null;
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }

        boolean broken = false;
        try {
            result = ShardedJedis.get(key);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public Boolean exists(String key) {
        Boolean result = false;
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.exists(key);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public String type(String key) {
        String result = null;
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.type(key);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    /**
     * 在某段时间后失效
     *
     * @param key
     * @param seconds
     * @return
     */
    public Long expire(String key, int seconds) {
        Long result = null;
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.expire(key, seconds);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    /**
     * 在某个时间点失效
     *
     * @param key
     * @param unixTime
     * @return
     */
    public Long expireAt(String key, long unixTime) {
        Long result = null;
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.expireAt(key, unixTime);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public Long ttl(String key) {
        Long result = null;
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.ttl(key);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public boolean setbit(String key, long offset, boolean value) {

        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        boolean result = false;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.setbit(key, offset, value);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public boolean getbit(String key, long offset) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        boolean result = false;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;

        try {
            result = ShardedJedis.getbit(key, offset);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public long setRange(String key, long offset, String value) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        long result = 0;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.setrange(key, offset, value);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public String getRange(String key, long startOffset, long endOffset) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        String result = null;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.getrange(key, startOffset, endOffset);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public boolean lock(String key) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        boolean result = false;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            final Long ttl = ShardedJedis.ttl(key);
            // 如果key永不过期，则清除key
            if (ttl != null && ttl == -1) {
                ShardedJedis.del(key);
            }
            final String setReply = ShardedJedis.set(key, "1", "NX", "EX", 10 * 60);
            return setReply != null && "ok".equalsIgnoreCase(setReply.trim());
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public boolean releaseLock(String key) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        boolean result = false;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            ShardedJedis.del(key);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public long setValue_nx(String key, String value) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        long result = 0L;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.setnx(key, value);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public long del(String key) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        long result = 0;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.del(key);

        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    public long increment(String key, long value) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        long result = 0L;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.incrBy(key,value);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    /**
     * 存储REDIS队列 顺序存储
     * @param  key reids键名
     * @param  value 键值
     */
    public long lpush(byte[] key, byte[] value) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        long result = 0L;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.lpush(key,value);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

    /**
     * 将队列中的最后一个元素(尾元素)弹出，并返回给客户端
     * @param key
     * @return
     */
    public byte[] rpop(byte[] key) {
        ShardedJedis ShardedJedis = redisDataSource.getRedisClient();
        byte[] result = null;
        if (ShardedJedis == null) {
            return result;
        }
        boolean broken = false;
        try {
            result = ShardedJedis.rpop(key);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            broken = true;
        } finally {
            redisDataSource.returnResource(ShardedJedis, broken);
        }
        return result;
    }

}