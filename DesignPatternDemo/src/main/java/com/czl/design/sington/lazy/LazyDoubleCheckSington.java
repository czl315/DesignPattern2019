package com.czl.design.sington.lazy;

/**
 * 懒汉式单例模式(双重锁判断懒汉式单例)
 * 1、隐藏所有的构造方法，私有，不能让用户通过构造方法修改单例
 * 2、类对象static 返回本身的类对象，此处使用volatile，多线程情况下可见
 * 3、暴露一个static的返回实例的方法，提供全局访问点，
 * 需要synchronized锁住才能保证多线程情况下返回单例，
 * 此处synchronized放置到方法内部，可以减小锁的粒度，但是需要双重判断才安全
 * 方法内判断是否已创建，如果未创建，则new出来，如果已创建则返回已创建的对象
 */
public class LazyDoubleCheckSington {
    private LazyDoubleCheckSington() {
    }

    private volatile static LazyDoubleCheckSington lazySimpleSington = null;//此处使用volatile，多线程情况下可见

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
