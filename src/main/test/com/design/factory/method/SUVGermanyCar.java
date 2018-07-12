package com.design.factory.method;

public class SUVGermanyCar extends GermanyCar {

    private Integer rideCount;

    public SUVGermanyCar() {
    }

    public SUVGermanyCar(String name, Integer price, Integer rideCount) {
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
