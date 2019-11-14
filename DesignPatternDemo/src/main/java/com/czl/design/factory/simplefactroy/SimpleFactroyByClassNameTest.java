package com.czl.design.factory.simplefactroy;

public class SimpleFactroyByClassNameTest {
    public static void main(String[] args) {
        SimpleFactroyByClassName simpleFactroy = new SimpleFactroyByClassName();
        System.out.println(simpleFactroy.create("com.czl.design.patterns.simplefactroy.AliPay"));
        System.out.println(simpleFactroy.create("com.czl.design.patterns.simplefactroy.WxPay"));
        System.out.println(simpleFactroy.create("aaa"));
    }
}
