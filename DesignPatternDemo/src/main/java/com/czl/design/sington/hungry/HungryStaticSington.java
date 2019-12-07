package com.czl.design.sington.hungry;

/**
 * 饿汗式单例
 * 1、隐藏所有的构造方法，私有，不能让用户通过构造方法修改单例
 * 2、类对象static final 返回本身的类对象，且使单例不可改变
 * 3、静态代码块使类加载时就创建单例对象
 * 4、暴露一个static的返回实例的方法，提供全局访问点
 */
public class HungryStaticSington {
    private HungryStaticSington(){}//1、隐藏所有的构造方法，私有，不能让用户通过构造方法修改单例
    private static final HungryStaticSington hungrySington ;//2、static final 返回本身的类对象，且使单例不可改变
    static {//3、静态代码块使类加载时就创建单例对象
        hungrySington = new HungryStaticSington();
    }
    public static HungryStaticSington getInstance(){//4、暴露一个static的返回实例的方法，提供全局访问点
        return hungrySington;
    }
}
