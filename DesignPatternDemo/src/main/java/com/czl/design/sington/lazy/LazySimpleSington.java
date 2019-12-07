package com.czl.design.sington.lazy;

/**
 * 懒汉式单例模式(简单类锁懒汉式单例)
 * 1、隐藏所有的构造方法，私有，不能让用户通过构造方法修改单例
 * 2、类对象static 返回本身的类对象
 * 3、暴露一个static的返回实例的方法，提供全局访问点，
 *      需要synchronized锁住才能保证多线程情况下返回单例，
 *      方法内判断是否已创建，如果未创建，则new出来，如果已创建则返回已创建的对象
 *  缺点:由于锁住的是静态方法，相当与类锁，性能较差
 */
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
