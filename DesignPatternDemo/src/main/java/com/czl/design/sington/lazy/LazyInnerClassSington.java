package com.czl.design.sington.lazy;

/**
 * 懒汉式单例模式(内部类懒汉式单例)
 * 1、隐藏所有的构造方法，私有，不能让用户通过构造方法修改单例
 * 2、声明默认返回类对象。static
 * 3、私有静态内部类：创建返回的对象。此内部类需要外部类的方法调用时才会创建
 * 4、提供一个static的返回实例的方法，提供全局访问点，返回内部类中创建的单例对象
 * 优点：1、没有使用锁，所以性能高。
 *      2、内部类优先于外部类的加载，
 */
public class LazyInnerClassSington {
    private LazyInnerClassSington(){}
    private static LazyInnerClassSington lazySington = null;

    private static class Holder{
        private static LazyInnerClassSington LAZY = new LazyInnerClassSington();
    }

    public static LazyInnerClassSington getInstance(){
        return Holder.LAZY;
    }
}
