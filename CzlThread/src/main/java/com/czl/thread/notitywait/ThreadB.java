package com.czl.thread.notitywait;

/**
 * czl
 * createTime:2019/11/22
 */
public class ThreadB extends Thread {
    Object object ;
    public ThreadB(Object obj) {
        object = obj;
    }

    @Override
    public void run() {
        try {
            StringBuffer desc = new StringBuffer("偶数进程-");
            while (TestAb.curInt <= 100) {
//                System.out.println(desc+"当前值：" + TestAb.curInt);
                synchronized (object) {
                    if (TestAb.curInt % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() +":"+ TestAb.curInt);
                        TestAb.curInt++;
                        object.notify();
                    } else {
//                        System.out.println(desc+"处理奇数-偶数锁等待；奇数锁通知可运行");
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
