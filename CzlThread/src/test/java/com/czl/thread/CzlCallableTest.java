package com.czl.thread;

import java.util.concurrent.*;

/**
 * czl
 * createTime:2019/10/8
 */
public class CzlCallableTest {
    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            Future<Object> future =  executorService.submit(new CzlCallable());
            System.out.println(future.get());

            Future<Object> future2 =  executorService.submit(new CzlCallable());
            System.out.println(future2.get());

            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
