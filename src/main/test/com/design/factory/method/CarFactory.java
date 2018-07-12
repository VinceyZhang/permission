package com.design.factory.method;

public abstract class CarFactory {
    public abstract Car createCar(String type);

    public void orderCar(String type) {
        Car car = createCar(type);
        System.out.println("我是"+car.getCountry()+" "+car.getName() + ",价值：" + car.getPrice() + "元钱。。。。");
    }

    ;
}
