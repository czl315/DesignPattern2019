package com.czl.jvm;

/**
 * czl
 * createTime:2019/11/14
 */
public class StackDemo {
    public static void main(String[] args) {
        System.out.println("当前进程：【"+Thread.currentThread().getName()+"】,方法【main()】-【压栈】");
        add(1, 2);
        doMoth();
        System.out.println("当前进程：【"+Thread.currentThread().getName()+"】,方法【main()】-【出栈】");
    }

    private static void doMoth() {
        System.out.println("当前进程：【"+Thread.currentThread().getName()+"】,方法【doMoth()】-【压栈】");
        System.out.println("当前进程：【"+Thread.currentThread().getName()+"】,方法【doMoth()】-【出栈】");
//        doMoth();调用本身方法会导致java.lang.StackOverflowError
    }

    private static int add(int i1, int i2) {
        System.out.println("当前进程：【"+Thread.currentThread().getName()+"】,方法【add(int i1, int i2)】-【压栈】");
        System.out.println("当前进程：【"+Thread.currentThread().getName()+"】,方法【add(int i1, int i2)】-局部变量表：i1="+i1+","+"i2="+i2);
        System.out.println("当前进程：【"+Thread.currentThread().getName()+"】,方法【add(int i1, int i2)】-【出栈】");
        return i1 + i2;
    }
}
