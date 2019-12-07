package com.czl.thread.notitywait;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * czl
 * createTime:2019/11/23
 */
public class InnerClassThreadExchange {
    static int curInt = 1;
    static Object lock = new Object();

    public static void main(String[] args) {
        InnerClassJi innerClassJi = new InnerClassJi(lock);
        new Thread(innerClassJi, "奇数进程").start();
        InnerClassOu innerClassOu = new InnerClassOu(lock);
        new Thread(innerClassOu, "偶数进程").start();
    }

    static class InnerClassJi implements Runnable {
        Object object;//锁对象
        //通过构造方法将锁对象传递过来
        public InnerClassJi(Object obj) {
            object = obj;
        }

        @Override
        public void run() {
            while (InnerClassThreadExchange.curInt <= 100) {
                int temp = InnerClassThreadExchange.curInt;
                synchronized (object) {//多个线程锁定同一个对象
                    if (temp % 2 == 1) {//此线程的业务处理
                        System.out.println(Thread.currentThread().getName() + ":" + temp);
                        InnerClassThreadExchange.curInt++;
                        object.notify();//业务处理完成后，通知别的线程可运行
                    } else {
                        try {
                            object.wait();//非自身的业务时，需要等待
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class InnerClassOu implements Runnable  {
        Object object;

        public InnerClassOu(Object obj) {
            object = obj;
        }

        @Override
        public void run() {
            while (InnerClassThreadExchange.curInt <= 100) {
                int temp = InnerClassThreadExchange.curInt;
                synchronized (object) {
                    if (temp % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + temp);
                        InnerClassThreadExchange.curInt++;
                        object.notify();
                    } else {
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
