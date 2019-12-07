package com.czl.thread.volate;

/**
 * czl
 * createTime:2019/11/22
 */
public class VolatileThread implements Runnable {
//     int i = 1;
    volatile int i;

    @Override
    public void run() {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            i++;
    }

}
