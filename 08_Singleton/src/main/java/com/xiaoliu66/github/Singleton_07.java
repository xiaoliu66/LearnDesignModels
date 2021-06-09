package com.xiaoliu66.github;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 22:44
 * @version 1.0
 * CAS "AtomicReference" 线程安全
 */
public class Singleton_07 {
    private static final AtomicReference<Singleton_07> INSTANCE = new AtomicReference<Singleton_07>();

    private static Singleton_07 instance;

    private Singleton_07() {

    }

    public static final Singleton_07 getInstance() {
        for (; ; ) {
            Singleton_07 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_07());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_07.getInstance());
        System.out.println(Singleton_07.getInstance());
    }
}
