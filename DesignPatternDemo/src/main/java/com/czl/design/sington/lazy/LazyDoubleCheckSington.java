package com.czl.design.sington.lazy;

public class LazyDoubleCheckSington {
    private LazyDoubleCheckSington() {
    }

    private volatile static LazyDoubleCheckSington lazySimpleSington = null;

    // 此方法需要synchronized锁住代码块，保证多线程情况下返回单例
    public static LazyDoubleCheckSington getInstance() {
        if (null == lazySimpleSington) {
            synchronized (LazyDoubleCheckSington.class) {
                if (null == lazySimpleSington) {
                    lazySimpleSington = new LazyDoubleCheckSington();
                }
            }
        }
        return lazySimpleSington;
    }
}
