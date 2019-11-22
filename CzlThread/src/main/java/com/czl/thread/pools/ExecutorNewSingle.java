package com.czl.thread.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * czl
 * createTime:2019/11/20
 */
public class ExecutorNewSingle implements Runnable {
    //创建线程池-固定数量
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        System.out.println("main-start");
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ExecutorNewSingle());
        }
        executorService.shutdown();
        System.out.println("main-end");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }
}
