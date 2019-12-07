package com.czl.thread.notitywait;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * czl
 * createTime:2019/11/23
 */
public class LockCondition {
    static int curInt = 1;
    static Object lock = new Object();

    static Lock reentrantLock = new ReentrantLock();
    static Condition condition = reentrantLock.newCondition();

    public static void main(String[] args) {
        InnerClassJi innerClassJi = new InnerClassJi(reentrantLock,condition);
        new Thread(innerClassJi, "奇数进程").start();
        InnerClassOu innerClassOu = new InnerClassOu(reentrantLock,condition);
        new Thread(innerClassOu, "偶数进程").start();
    }

    static class InnerClassJi implements Runnable {
        Object object;
        Lock reentrantLock;
        Condition condition;

        public InnerClassJi(Object obj) {
            object = obj;
        }

        public InnerClassJi(Lock lock, Condition cond) {
            this.reentrantLock = lock;
            this.condition = cond;
        }

        @Override
        public void run() {
            try {
                while (LockCondition.curInt <= 100) {
                    int temp = LockCondition.curInt;
//                synchronized (object) {//多个线程锁定同一个对象
                    reentrantLock.lock();
                    if (temp % 2 == 1) {//此线程的业务处理
                        reentrantLock.lock();
                        System.out.println(Thread.currentThread().getName() + ":" + temp);
                        LockCondition.curInt++;
                        reentrantLock.unlock();
//                        object.notify();//业务处理完成后，通知别的线程可运行
                        condition.signal();
                    } else {
//                            object.wait();//非自身的业务时，需要等待
                        condition.await();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    static class InnerClassOu implements Runnable {
        Object object;
        Lock reentrantLock;
        Condition condition;

        public InnerClassOu(Object obj) {
            object = obj;
        }

        public InnerClassOu(Lock lock, Condition cond) {
            this.reentrantLock = lock;
            this.condition = cond;
        }

        @Override
        public void run() {
            while (LockCondition.curInt <= 100) {
                try {
                    int temp = LockCondition.curInt;
//                synchronized (object) {
                    if (temp % 2 == 0) {
                        reentrantLock.lock();
                        System.out.println(Thread.currentThread().getName() + ":" + temp);
                        LockCondition.curInt++;
                        reentrantLock.unlock();
//                        object.notify();
                        condition.signal();
                    } else {
//                        object.wait();
                        condition.await();
                    }
//                }
                } catch (Exception e){
                    e.printStackTrace();
                }finally {
                    reentrantLock.unlock();
                }
            }
        }
    }
}


