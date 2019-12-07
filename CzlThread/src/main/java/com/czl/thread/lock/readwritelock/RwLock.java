package com.czl.thread.lock.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * czl
 * createTime:2019/11/24
 */
public class RwLock {
    static ReadWriteLock rwlock = new ReentrantReadWriteLock();

    private static class ReadClass implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "-ReadClass -start");
            rwlock.readLock().lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rwlock.readLock().unlock();
            System.out.println(Thread.currentThread().getName() + "-ReadClass -end");
        }
    }

    private static class WriteClass implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "-WriteClass -start");
            rwlock.writeLock().lock();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rwlock.writeLock().unlock();
            System.out.println(Thread.currentThread().getName() + "-WriteClass -end");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new ReadClass()).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(new WriteClass()).start();
        }
    }
}
