package com.czl.design.sington.lazy;

import com.czl.design.sington.lazy.LazyThreadInnerClass;

public class LazyInnerClassSingtonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyThreadInnerClass());
        Thread t2 = new Thread(new LazyThreadInnerClass());
        t1.start();
        t2.start();
    }
}
