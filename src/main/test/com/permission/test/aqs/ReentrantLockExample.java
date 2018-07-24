package com.permission.test.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    public static int clientTotal = 200;

    public static int threadTotal = 10;

    public static int count = 0;

    public static final Lock lock=new ReentrantLock();

    public static void main(String args[]) throws Exception {

        Semaphore semaphore = new Semaphore(threadTotal);
        ExecutorService executor = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch=new CountDownLatch(clientTotal);


        for (int i = 0; i < clientTotal; i++) {
            final int threadNum = i;
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    showInfo(threadNum);
                    semaphore.release();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        executor.shutdown();

        System.out.println( "最后的count为：" + count);
    }

    public static void showInfo(int threadNum) throws Exception {
        lock.lock();
        ++count;
        lock.unlock();
        System.out.println(threadNum + "此时的count为：" + count);
       // Thread.sleep(1000);
    }
}
