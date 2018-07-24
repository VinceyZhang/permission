package com.permission.test.aqs;

import java.util.concurrent.*;

public class SemaphoreExample {

    public static void main(String[] args) {

        Semaphore semaphore=new Semaphore(3);
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    showInfo(threadNum);
                    semaphore.release();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            });
        }
        executor.shutdown();

    }

    public static void showInfo(int threadNum) throws Exception {
        System.out.println(threadNum);

        Thread.sleep(1000);
    }
}
