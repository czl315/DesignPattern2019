package com.czl.design.sington.lazy;

public class LazyInnerClassSington {
    private LazyInnerClassSington(){}
    private static LazyInnerClassSington lazySington = null;
    // 此方法需要synchronized锁住才能保证多线程情况下返回单例
    public static LazyInnerClassSington getInstance(){
        return Holder.LAZY;
    }

    private static class Holder{
        private static LazyInnerClassSington LAZY = new LazyInnerClassSington();
    }

}
