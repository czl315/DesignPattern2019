package com.czl.design.sington.lazy;

import com.czl.design.sington.lazy.LazyDoubleCheckSington;
import com.czl.design.sington.lazy.LazyInnerClassSington;

public class LazyThreadInnerClass implements Runnable {
    @Override
    public void run() {
        LazyInnerClassSington sington = LazyInnerClassSington.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+sington);
    }
}
