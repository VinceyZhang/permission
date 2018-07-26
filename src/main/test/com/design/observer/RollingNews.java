package com.design.observer;

/**
 * Created by ok_vince on 2018-07-26.
 */
public class RollingNews {


    public static void main(String []args){
        CarInfo info=new CarInfo();
        CarNewsWeb carNewsWeb=new CarNewsWeb(info);

        info.setMembers("BMW721",12300.00);
        info.setMembers("奔驰s",22200.0);
    }
}
