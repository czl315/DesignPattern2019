package com.czl.configation;

/**
 * czl
 * createTime:2019/10/11
 */
public class GenericConfiguration {
    public static void main(String[] args) {
        String dir = System.getProperty("user.home");
        System.out.println(dir);
        String aaa = System.getProperty("user.aaa","默认值");
        System.out.println(aaa);
    }
}
