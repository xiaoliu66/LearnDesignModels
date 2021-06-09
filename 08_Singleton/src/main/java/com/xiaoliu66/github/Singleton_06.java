package com.xiaoliu66.github;
/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 22:38
 * @version 1.0
 * 双重锁校验（线程安全）
 */
public class Singleton_06 {
    private static volatile Singleton_06 instance;

    private Singleton_06() {

    }

    public static Singleton_06 getInstance() {
        if (null != instance) return instance;
        synchronized (Singleton_06.class) {
            if (instance == null) {
                instance = new Singleton_06();
            }
        }
        return instance;
    }
}
