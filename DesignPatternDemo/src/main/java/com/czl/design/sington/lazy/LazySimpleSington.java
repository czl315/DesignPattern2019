package com.czl.design.sington.lazy;

public class LazySimpleSington {
    private LazySimpleSington(){}
    private static LazySimpleSington lazySimpleSington = null;
    // 此方法需要synchronized锁住才能保证多线程情况下返回单例
    public synchronized static LazySimpleSington getInstance(){
        if(null == lazySimpleSington){
            lazySimpleSington = new LazySimpleSington();
        }
        return lazySimpleSington;
    }
}
