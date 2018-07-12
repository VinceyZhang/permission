package com.design.factory.method;

public class SpeedGermanyCar extends GermanyCar {

    private Integer speed;

    public SpeedGermanyCar() {
    }

    public SpeedGermanyCar(String name, Integer price, Integer speed) {
        super(name, price);
        this.speed = speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
