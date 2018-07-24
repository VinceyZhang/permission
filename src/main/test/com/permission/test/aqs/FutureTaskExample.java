package com.permission.test.aqs;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {

    public static void main(String args[])throws Exception {

        FutureTask<String > futureTask=new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "做的还好~~~";
            }
        });

        new Thread(futureTask).start();
        System.out.println("这是线程执行结果："+futureTask.get());

    }
}
