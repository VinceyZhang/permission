package com.design.singleton;

/**
 * 懒加载
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    return new Singleton();
                }
            }
        }
        return null;
    }
}
