package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-18.
 */
public class Store {

    public static void main(String args[]) {
        Dog dog=new ToyDog();
        dog.getBarkBehaviour().bark();
        dog=new ChinaDog();
        dog.getBarkBehaviour().bark();
        dog=new JapanDog();
        dog.getBarkBehaviour().bark();
    }

}


