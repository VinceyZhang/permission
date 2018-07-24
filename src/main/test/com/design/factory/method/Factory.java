package com.design.factory.method;

/**
 * 简单工厂模式，一种规范，不是模式
 */
public class Factory {
    public Car String(String type) {
        Car car = null;
        if (type.equals("GermanySpeed")) {
            car = new SpeedGermanyCar();
            return car;
        } else if (type.equals("GermanySUV")) {
            car = new SUVGermanyCar();
            return car;
        } else if (type.equals("ChinaSpeed")) {
            car = new SpeedChinaCar();
            return car;
        } else if (type.equals("ChinaSUV")) {
            car = new SUVChinaCar();
            return car;
        } else
            return null;
    }
}
