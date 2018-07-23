package com.design.strategy;

/**
 * Created by ok_vince on 2018-07-18.
 */
public class ChinaDog extends Dog {

 public ChinaDog(){
     this.barkBehaviour=new ChineseDogBark();
 }


}
