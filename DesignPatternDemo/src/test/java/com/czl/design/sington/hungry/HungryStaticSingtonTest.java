package com.czl.design.sington.hungry;

public class HungryStaticSingtonTest {
    public static void main(String[] args) {
        HungryStaticSington hungryStaticSingtong = HungryStaticSington.getInstance();
        System.out.println(hungryStaticSingtong.getInstance());
        System.out.println(hungryStaticSingtong.getInstance());
        System.out.println(hungryStaticSingtong.getInstance());
    }

}
