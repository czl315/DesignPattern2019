package com.czl.design.sington.hungry;

public class HungrySingtonTest {
    public static void main(String[] args) {
        HungrySington hungrySingtong = HungrySington.getInstance();
        System.out.println(hungrySingtong.getInstance());
        System.out.println(hungrySingtong.getInstance());
        System.out.println(hungrySingtong.getInstance());

    }

}
