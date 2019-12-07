package com.czl.jvm;

/**
 * czl
 * createTime:2019/11/15
 */
public class StringAndStringBuiler {
    public static void main(String[] args) {
        System.out.println(m1());
        System.out.println(m2());
        System.out.println(m3());
    }

    private static String m1(){
        String str ="";
        for (int i = 0; i < 10; i++) {
            str = str+"a";
        }
        return str;
    }

    private static String m2(){
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb = sb.append("a");
        }
        return sb.toString();
    }

    private static String m3(){
        StringBuffer sb =new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb = sb.append("a");
        }
        return sb.toString();
    }
}
