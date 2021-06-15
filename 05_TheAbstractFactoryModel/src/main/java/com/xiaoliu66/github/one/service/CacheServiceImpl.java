package com.xiaoliu66.github.one.service;

import com.xiaoliu66.github.one.redis.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 21:10
 * @version 1.0
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.getKey(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
