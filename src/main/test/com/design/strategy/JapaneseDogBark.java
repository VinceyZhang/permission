package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-19.
 */
public class JapaneseDogBark implements BarkBehaviour {

    @Override
    public void bark() {
        System.out.println("我是说日文的狗~~~~ 雅蠛蝶 汪汪");
    }
}
