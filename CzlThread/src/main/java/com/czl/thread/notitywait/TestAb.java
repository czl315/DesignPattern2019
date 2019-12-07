package com.czl.thread.notitywait;

/**
 * czl
 * createTime:2019/11/22
 */
public class TestAb {
    public static int curInt = 1;

    public static int getCurInt() {
        return curInt;
    }

    public static void setCurInt(int curInt) {
        TestAb.curInt = curInt;
    }


    public static void main(String[] args) {
        TestAb LockObj = new TestAb();//锁

        ThreadA threadA = new ThreadA(LockObj);
        threadA.setName("奇数线程");
        threadA.start();

        ThreadB threadB = new ThreadB(LockObj);
        threadB.setName("偶数线程");
        threadB.start();
    }
}
