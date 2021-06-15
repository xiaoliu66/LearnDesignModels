package com.xiaoliu66.github.one.service;


import com.xiaoliu66.github.one.redis.EGM;
import com.xiaoliu66.github.one.redis.IIR;
import com.xiaoliu66.github.one.redis.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 21:13
 * @version 1.0
 */
public class CacheClusterServiceImpl implements CacheTypeService {
    private RedisUtils redisUtils = new RedisUtils();
    private EGM egm = new EGM();
    private IIR iir = new IIR();


    @Override
    public String get(String key, String redisType) {
        if (redisType.equals("1")) {
            return egm.gain(key);
        }

        if (redisType.equals("2")) {
            return iir.get(key);
        }

        return redisUtils.getKey(key);
    }

    @Override
    public void set(String key, String value, String redisType) {
        if (redisType.equals("1")) {
            egm.set(key, value);
        }

        if (redisType.equals("2")) {
            iir.set(key, value);
        }

        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, String redisType) {
        if (redisType.equals("1")) {
            egm.setEx(key, value, timeout, timeUnit);
        }

        if (redisType.equals("2")) {
            iir.setExpire(key, value, timeout, timeUnit);
        }

        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, String redisType) {
        if (redisType.equals("1")) {
            egm.del(key);
        }

        if (redisType.equals("2")) {
            iir.del(key);
        }

        redisUtils.del(key);
    }
}
