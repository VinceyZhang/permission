package com.permission.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                System.out.println("这是线程：" + threadNum);
            });
        }
        executorService.shutdown();
    }

}
