package com.design.factory.abstractor;

public class DoMain {

    public static void main(String[] args) {
        //来到4s
        CarStore carStore=new CarStore();
        //先看德国车
        carStore.show("Germany");
        //再看国产
        carStore.show("China");
    }
}
