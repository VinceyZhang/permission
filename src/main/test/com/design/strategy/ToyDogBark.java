package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-19.
 */
public class ToyDogBark implements  BarkBehaviour{
    @Override
    public void bark() {
        System.out.println("作为玩具狗，还是不要吠了····");
    }
}
