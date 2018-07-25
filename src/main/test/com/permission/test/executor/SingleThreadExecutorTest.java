package com.permission.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorTest {

    public static void main(String[] args) {

        //单线程式线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                System.out.println("这是线程：" + threadNum);
            });
        }
        executorService.shutdown();
    }

}
