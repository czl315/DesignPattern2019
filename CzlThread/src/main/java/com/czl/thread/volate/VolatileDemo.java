package com.czl.thread.volate;

/**
 * czl
 * createTime:2019/11/22
 */
public class VolatileDemo{

    public static void main(String[] args) throws InterruptedException {
//        new Thread(new NoVolatileFlag()).start();
        for (int i = 0; i <10 ; i++) {
            new Thread(new VolatileThread()).start();
        }

        Thread.sleep(1000);
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.i=22;
    }
}
