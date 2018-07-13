package com.design.singleton.soon;

/**
 * 立即加载模式
 */
public class Singleton {

    /**
     *
     */
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
