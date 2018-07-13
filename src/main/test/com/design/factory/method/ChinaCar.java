package com.design.factory.method;

/**
 * 其实这个类可以省略，不过想分国产和进口车，
 * 故而把这个类设为abstract，而具体的产品还是
 * 继承该类的子类。
 */
public abstract class ChinaCar extends Car {

    public ChinaCar() {
    }

    public ChinaCar(String name, Integer price) {
        super(name, price);
        this.country = "国产";
    }
}
