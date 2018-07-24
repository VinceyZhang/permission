package com.permission.test.aqs;

import java.util.concurrent.*;

public class FutureExample {

    static class MyCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            return "做得好";
        }
    }

    public static void main(String args[])throws  Exception{

        ExecutorService executorService=Executors.newCachedThreadPool();
        Future<String > future=executorService.submit(new MyCallable());
        String result=future.get();

        System.out.println("这是线程执行结果："+result);
    }
}
