package com.czl.design.sington.lazy;

import com.czl.design.sington.lazy.LazyDoubleCheckSington;
import com.czl.design.sington.lazy.LazySimpleSington;

public class LazyThread implements Runnable {
    @Override
    public void run() {
//        LazySimpleSington lazySimpleSington = LazySimpleSington.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSington);

        LazyDoubleCheckSington sington = LazyDoubleCheckSington.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+sington);
    }
}
