package com.permission.test.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {

    public static void main(String[] args) throws Exception {

        CountDownLatch countDownLatch=new CountDownLatch(10);
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            executor.execute(() -> {
                try {

                    showInfo(threadNum);

                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await(10,TimeUnit.MILLISECONDS);
        System.out.println("已执行完");
        executor.shutdown();

    }

    public static void showInfo(int threadNum) throws Exception {
        System.out.println("这是线程："+threadNum);

        Thread.sleep(1000);
    }
}
