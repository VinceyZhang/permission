package com.design.factory.method;

public class SUVChinaCar extends ChinaCar {

    private Integer rideCount;

    public SUVChinaCar() {
    }

    public SUVChinaCar(String name, Integer price, Integer rideCount) {
        super(name, price);
        this.rideCount = rideCount;
    }

    public Integer getRideCount() {
        return rideCount;
    }

    public void setRideCount(Integer rideCount) {
        this.rideCount = rideCount;
    }
}
