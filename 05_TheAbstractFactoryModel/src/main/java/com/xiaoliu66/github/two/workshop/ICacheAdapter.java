package com.xiaoliu66.github.two.workshop;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 22:10
 * @version 1.0
 * 适配器接口
 */
public interface ICacheAdapter {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
