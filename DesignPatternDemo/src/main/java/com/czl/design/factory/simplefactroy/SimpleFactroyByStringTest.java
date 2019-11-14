package com.czl.design.factory.simplefactroy;

public class SimpleFactroyByStringTest {
    public static void main(String[] args) {
        SimpleFactroyByString simpleFactroy = new SimpleFactroyByString();
        System.out.println(simpleFactroy.create("ali"));
        System.out.println(simpleFactroy.create("wx"));
        System.out.println(simpleFactroy.create("aaa"));
    }
}
