package com.czl.thread.volate;

/**
 * czl
 * createTime:2019/11/22
 */
public class NoVolatileFlag implements Runnable{
    static boolean canWatch = true;

    @Override
    public void run() {
        while (canWatch){
            System.out.println("1111111");
        }
    }

}
