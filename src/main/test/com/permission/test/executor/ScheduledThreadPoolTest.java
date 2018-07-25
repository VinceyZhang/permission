package com.permission.test.executor;

import org.omg.CORBA.TIMEOUT;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class ScheduledThreadPoolTest {

    public static void main(String[] args) {

       //单线程式线程池
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3000);

//        for (int i = 0; i < 10; i++) {
//            final int threadNum = i;
//            executorService.execute(() -> {
//                System.out.println("这是线程：" + threadNum);
//            });
//        }
        //时间到了执行
//        executorService.schedule(()->{
//            System.out.println("这是调度线程");
//        },3,TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(()->{
            System.out.println("这是定时周期性调度线程");
        },1,3,TimeUnit.SECONDS);
      //  executorService.shutdown();

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("这是Time定时任务");
            }
        }, new Date(), 5 * 1000);
    }

}
