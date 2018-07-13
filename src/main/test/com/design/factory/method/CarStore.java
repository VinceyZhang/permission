package com.design.factory.method;


public class CarStore {

    private CarFactory carFactory;


    public void showCar(String type) {
        getCarFactory().orderCar(type);
    }

    public CarFactory getCarFactory() {
        return carFactory;
    }

    public void setCarFactory(CarFactory carFactory) {
        this.carFactory = carFactory;
    }


}
