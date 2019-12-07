package com.czl.thread.lock.dead;

/**
 * czl
 * createTime:2019/11/24
 */
public class DeadLockTest {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        DeadLock1 deadLock1 = new DeadLock1(object1, object2);
        new Thread(deadLock1).start();
        DeadLock2 deadLock2 = new DeadLock2(object1, object2);
        new Thread(deadLock2).start();
    }
}
