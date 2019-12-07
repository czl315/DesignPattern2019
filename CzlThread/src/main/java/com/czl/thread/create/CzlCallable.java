package com.czl.thread.create;

import java.util.concurrent.Callable;

/**
 * czl
 * createTime:2019/10/8
 */
public class CzlCallable implements Callable {
    @Override
    public String call() throws Exception {
        String rs = "默认call返回";
        System.out.println("[实现Callable]czl线程名称："+Thread.currentThread().getName());
        return rs;
    }

    public static void main(String[] args) throws Exception {
        Callable callable = new CzlCallable();
        System.out.println((String) (callable.call()));
    }
}
