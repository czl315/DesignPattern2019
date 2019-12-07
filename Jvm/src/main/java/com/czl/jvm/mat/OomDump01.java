package com.czl.jvm.mat;

import java.util.ArrayList;
import java.util.List;

/**
 * czl
 * createTime:2019/11/18
 * -Xmx10M -Xms10M -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=L:\work\project\dumpFile/OomDump01.dump
 */
public class OomDump01 {
    static List<byte[]> list = new ArrayList<byte[]>();

    public static void main(String[] args) {
        System.out.println("start");
//        while (true){
////            System.out.println("dosomething...while (true)");
////        }
//        for (int i = 0; i < 100; i++) {
////            byte[] b1 = new byte[2 * 1024 * 1024];
////            list.add(b1);
//            System.out.println("dosomething...b1");
////            list.remove(b1);
//        }

//        byte[] b2 = new byte[2 * 1024 * 1024];
//        list.add(b2);
//        System.out.println("dosomething...");
//        list.remove(b2);
//        byte[] b3 = new byte[2 * 1024 * 1024];
//        list.add(b3);
//        System.out.println("dosomething...");
//        list.remove(b3);
//        byte[] b4 = new byte[4 * 1024 * 1024];
//        list.add(b4);
//        System.out.println("dosomething...");
////        try {
////            Thread.sleep(3000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        list.remove(b4);

//        System.out.println("end");
    }
}
