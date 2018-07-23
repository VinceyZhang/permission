package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-19.
 */
public class ChineseDogBark implements BarkBehaviour {
    @Override
    public void bark() {
        System.out.println("我是说中文的狗~~~~ 汪汪");
    }
}
