package com.czl.thread.lock.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * czl
 * createTime:2019/11/24
 */
public class SynchronizedAndLock {
    public Object lock1 = new Object();
    public Object lock2 = new Object();
    Lock lock = new ReentrantLock();

    public void synchronizedDeadLock1() {
        synchronized (lock1) {
            System.out.println("fun1()-synchronized (lock1)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
                System.out.println("fun1()-synchronized (lock2)");
            }
            synchronizedDeadLock2();
        }
    }

    public void synchronizedDeadLock2() {
        synchronized (lock2) {
            System.out.println("fun2()-synchronized (lock2)");
            synchronized (lock1) {
                System.out.println("fun2()-synchronized (lock1)");
            }
        }
    }

    public void reentrtantLock1() {
        System.out.println("reentrtantLock1() -start");
        lock.lock();
        System.out.println("fun1()-reentrtantLock1 (lock1)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        System.out.println("fun1()-reentrtantLock1 (lock2)");
        lock.unlock();
        lock.unlock();
        reentrtantLock2();
        System.out.println("reentrtantLock1() -end");
    }

    public void reentrtantLock2() {
        System.out.println("reentrtantLock2() -start");
        lock.lock();
        System.out.println("fun2()-reentrtantLock1 ()");
        lock.unlock();
        lock.lock();
        System.out.println("fun2()-reentrtantLock2 ()");
        lock.unlock();
        System.out.println("reentrtantLock2() -end");
    }


    public static void main(String[] args) {
        SynchronizedAndLock synchronizedDeadLock = new SynchronizedAndLock();
        //synchnozied死锁
//        new Thread(() -> synchronizedDeadLock.synchronizedDeadLock1()).start();
//        new Thread(() -> synchronizedDeadLock.synchronizedDeadLock2()).start();

        new Thread(() -> synchronizedDeadLock.reentrtantLock1()).start();
        new Thread(() -> synchronizedDeadLock.reentrtantLock2()).start();
    }

}
