package com.permission.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolTest {

    public static void main(String[] args){

        //控制并发数
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                System.out.println("这是线程：" + threadNum);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }

            });
        }
        executorService.shutdown();
    }

}
