package com.design.factory.abstractor;

/**
 * Created by ok_vince on 2018-07-14.
 */
public class ChinaShenzhenPartFactory implements ChairPartFactory{

    //任意组合一下
    @Override
    public Tyre createTyre() {
        return new WoolTyre();
    }

    @Override
    public Window createWindow() {
        return new LittleWindow();
    }

    /**
     * 如果只有ChairPartFactory里面的方法出现变动，只会影响实现了ChairPartFactory接口的子类
     * @return
     */
    @Override
    public Chair createChair() {
        return new LeatherChair();
    }
}
