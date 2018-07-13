package com.design.factory.method;

/**
 * 国产车工厂生产真正具体的产品
 */
public class ChinaCarFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        //通过提供的type确定要生产国产车的那种具体类型的车
        if (type.equals("speed"))
            return new SpeedChinaCar("红旗", 30, 250);
        else if (type.equals("SUV"))
            return new SUVChinaCar("荣威", 500, 250);
        else
            return null;

    }
}
