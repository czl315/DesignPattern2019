package com.czl.thread.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * czl
 * createTime:2019/11/20
 */
public class ExecutorNewScheduled implements Runnable {
    //创建线程池-缓存
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

    public static void main(String[] args) {
        System.out.println("main-start");
        int[] times = {1,5,11,11,11,11,12,13,14,15};
        for (int i = 0; i < 10; i++) {
            executorService.schedule(new ExecutorNewScheduled(),times[i], TimeUnit.SECONDS);
        }
        executorService.shutdown();
        System.out.println("main-end");
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }
}
