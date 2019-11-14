package com.czl.design.sington.lazy;

public class LazySimpleSingtonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyThread());
        Thread t2 = new Thread(new LazyThread());
        t1.start();
        t2.start();
    }
}
