package com.design.observer;

/**
 * Created by ok_vince on 2018-07-26.
 */
public class CarNewsWeb implements Observer, DisplayBoard {

    private String name;
    private Double price;
    private Subject carInfo;

    public CarNewsWeb(Subject carInfo){
        this.carInfo=carInfo;
        carInfo.registerObserver(this);
    }

    @Override
    public void update(String name, Double price) {
        this.name=name;
        this.price=price;
        display();
    }

    @Override
    public void display() {
        System.out.println("新车报价："+this.name+"为"+this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Subject getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(Subject carInfo) {
        this.carInfo = carInfo;
    }
}
