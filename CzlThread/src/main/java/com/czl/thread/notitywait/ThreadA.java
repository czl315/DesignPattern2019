package com.czl.thread.notitywait;

/**
 * czl
 * createTime:2019/11/22
 */
public class ThreadA extends Thread {
    TestAb object;

    public ThreadA(TestAb obj) {
        object = obj;
    }

    @Override
    public void run() {
        try {
            StringBuffer desc = new StringBuffer("奇数进程-");
            while (TestAb.curInt <= 100) {
//                System.out.println(desc+"当前值：" + TestAb.curInt);
                synchronized (object) {
                    if (TestAb.curInt % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() +":"+ TestAb.curInt);
                        TestAb.curInt++;
                        object.notify();
                    } else {
//                        System.out.println(desc+"处理偶数-奇数锁等待；偶数锁通知可运行");
                        object.wait();
                    }
                }
//                System.out.println(desc+"处理循环");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
