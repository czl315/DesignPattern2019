package com.czl.thread.interupt;

import java.util.concurrent.TimeUnit;

/**线程中断interrupt
 * czl
 * createTime:2019/11/21
 */
public class ThreadInterupt {
    public static void main(String[] args) {
//        isInterrupt();
        interruptException();
    }

    private static void isInterrupt(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(i++);
                }
//                while (true) {
//                    System.out.println(i++);
//                }
            }
        });
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }

    private static void interruptException(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(i++);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        });
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println(thread.isInterrupted());

        Object obj = new Object();
        obj.hashCode();
    }
}
