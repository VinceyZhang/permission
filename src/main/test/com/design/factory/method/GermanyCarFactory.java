package com.design.factory.method;

public class GermanyCarFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        if (type.equals("speed"))
            return new SpeedGermanyCar("保时捷", 2200, 250);
        else if (type.equals("SUV"))
            return new SUVGermanyCar("宝马", 2100, 250);
        else
            return null;

    }
}
