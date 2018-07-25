package com.permission.test.deallock;


public class DeadLock implements Runnable {


    public int t = 1;
    private static Object o1 = new Object(), o2 = new Object();

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock();
        DeadLock d2 = new DeadLock();


        d1.t = 1;
        d2.t = 0;
        new Thread(d1).start();
        new Thread(d2).start();

    }

    @Override
    public void run() {


        if (t == 1) {
            synchronized (o1) {
                try {
                    System.out.println("t为0，锁住o1");
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.getMessage();
                }

                synchronized (o2) {
                    System.out.println("t为0，锁住o2");
                    System.out.println("这是t为0的下面");
                }
            }
        }

        if (t == 0) {
            synchronized (o2) {
                try {
                    System.out.println("t为1，锁住o2");
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.getMessage();
                }

                synchronized (o1) {
                    System.out.println("t为1，锁住o1");
                    System.out.println("这是t为1的下面");
                }
            }
        }
    }
}
