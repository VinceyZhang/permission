package com.permission.test.aqs;

import java.util.concurrent.*;

public class CyclicBarrierExample {
    static   CyclicBarrier barrier = new CyclicBarrier(3);

    static int threadCount= 0;
    public static void main(String[] args) throws Exception {


        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            executor.execute(() -> {
                try {

                    showInfo(threadNum);

                } catch (Exception e) {
                    System.err.println(e.getMessage());
                } finally {

                }
            });
        }


        executor.shutdown();

    }

    public static void showInfo(int threadNum) throws Exception {

        System.out.println("ready--这是+之前：" + threadCount);
        threadCount++;
        barrier.await(); Thread.sleep(1000);
        System.out.println("continue--这是+之后：" + threadCount);

    }
}
