package com.czl.jvm;

/**
 * czl
 * createTime:2019/11/13
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        System.out.println("xxxClass的父类父类-getClassLoader():"+new ClassLoaderDemo().getClass().getClassLoader().getParent().getParent());
        System.out.println("xxxClass的父类-getClassLoader():"+new ClassLoaderDemo().getClass().getClassLoader().getParent());
        System.out.println("xxxClass-getClassLoader():"+new ClassLoaderDemo().getClass().getClassLoader());
        System.out.println("Object()-getClassLoader():"+new Object().getClass().getClassLoader());
    }
}
