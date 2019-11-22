package com.czl.thread.state;

/**
 * czl
 * createTime:2019/11/21
 */
public class TestThreadState {
    public static void main(String[] args) {
//        threadStateRunnable();
        threadStateBlocked();
    }

    private static void  threadStateRunnable(){
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("threadStateRunnable");
                }
            }, "threadStateRunnable-01").start();
        }
    }

    private static void  threadStateBlocked(){
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("threadStateBLOCKED-start");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("threadStateBLOCKED-end");
                }
            }, "threadStateBLOCKED-01").start();
        }
    }
}
