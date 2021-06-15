package com.xiaoliu66.github.two.factory;

import com.xiaoliu66.github.two.utils.ClassLoaderUtils;
import com.xiaoliu66.github.two.workshop.ICacheAdapter;
import sun.misc.ClassLoaderUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/15 22:25
 * @version 1.0
 */
public class JDKInvocationHandler implements InvocationHandler {
    private ICacheAdapter iCacheAdapter;

    public JDKInvocationHandler(ICacheAdapter iCacheAdapter) {
        this.iCacheAdapter = iCacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(iCacheAdapter, args);
    }
}
