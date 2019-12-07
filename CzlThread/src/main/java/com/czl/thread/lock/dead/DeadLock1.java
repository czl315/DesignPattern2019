package com.czl.thread.lock.dead;

/**
 * czl
 * createTime:2019/11/24
 */
public class DeadLock1 implements Runnable{
    private Object lock1;
    private Object lock2;

    public DeadLock1(Object object1,Object object2) {
        lock1 = object1;
        lock2 = object2;
    }

    @Override
    public void run() {
        synchronized (lock1){
            System.out.println("DeadLock1-lock1-已锁定");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println("DeadLock1-lock2-已锁定");
            }
        }
    }
}
