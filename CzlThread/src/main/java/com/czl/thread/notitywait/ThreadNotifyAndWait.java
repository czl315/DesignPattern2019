package com.czl.thread.notitywait;

/**
 * czl
 * createTime:2019/11/20
 * Java 多线程中两个线程交替执行，一个输出偶数，一个输出奇数
 */
public class ThreadNotifyAndWait {
    public static void main(String[] args) throws Exception {
        final Object LockObj = new Object();
        for (int i = 0; i < 10; i++) {
            ThreadJi threadJishu = new ThreadJi(LockObj);
            new Thread(threadJishu).start();
        }
//        for (int i = 0; i < 10; i++) {
            ThreadOu threadOushu = new ThreadOu(LockObj);
            new Thread(threadOushu).start();
//        }
    }
}
