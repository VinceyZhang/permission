package com.design.factory.method;

public class ChinaCarFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        if (type.equals("speed"))
            return new SpeedChinaCar("红旗", 30, 250);
        else if (type.equals("SUV"))
            return new SUVChinaCar("荣威", 500, 250);
        else
            return null;

    }
}
