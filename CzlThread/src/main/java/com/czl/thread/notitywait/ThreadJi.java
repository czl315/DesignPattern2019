package com.czl.thread.notitywait;

/**
 * czl
 * createTime:2019/11/20
 */
public class ThreadJi extends Thread {
    volatile boolean flag ;
    final Object obj;

    public ThreadJi(Object object) {
        obj = object;
    }

    @Override
    public void run() {
        synchronized (obj) {
//            System.out.println(flag);
//            System.out.println(obj.toString());
//            if (!flag) {
                System.out.println("奇数线程-start-" + Thread.currentThread().getName());
                try {
                    obj.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("奇数线程-end-" + Thread.currentThread().getName());
//                obj.notify();
//            }
        }
    }
}
