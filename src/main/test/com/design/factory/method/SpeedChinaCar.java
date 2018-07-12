package com.design.factory.method;

public class SpeedChinaCar extends ChinaCar {

    private Integer speed;

    public SpeedChinaCar() {
    }

    public SpeedChinaCar(String name, Integer price, Integer speed) {
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
