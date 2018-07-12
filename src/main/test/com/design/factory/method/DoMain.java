package com.design.factory.method;

public class DoMain {

    public static void main(String args[]) {

        //找到4s
        CarStore carStore=new CarStore();
        //确定要哪国车就联系哪个国家的工厂
        carStore.setCarFactory(new GermanyCarFactory());
        //确定汽车类型，展示订车信息
        carStore.showCar("speed");

        //德国车太贵，还是看看国产
        carStore.setCarFactory(new ChinaCarFactory());
        //看看跑车
        carStore.showCar("speed");
        //再看看SUV
        carStore.showCar("SUV");
    }
}
