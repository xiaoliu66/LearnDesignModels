package com.xiaoliu66.github.two.factory;

import com.xiaoliu66.github.two.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 22:18
 * @version 1.0
 * 代理抽象工厂
 */
public class JDKProxyFactory {
    public static <T> T getProxy(Class cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws InstantiationException, IllegalAccessException {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{cacheClazz}, handler);
    }

}
