package com.czl.thread.notity;

/**
 * czl
 * createTime:2019/11/20
 */
public class ThreadOu extends Thread {
    final Object obj;

    public ThreadOu(Object object) {
        obj = object;
    }

    @Override
    public void run() {
        synchronized (obj) {
            System.out.println("偶数线程-start-"+Thread.currentThread().getName());
//            try {
//                obj.wait();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            System.out.println("偶数线程-end-"+Thread.currentThread().getName());
            obj.notifyAll();
        }

    }
}
