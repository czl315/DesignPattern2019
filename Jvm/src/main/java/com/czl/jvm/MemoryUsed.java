package com.czl.jvm;

/**
 * czl
 * createTime:2019/11/14
 *
 * -Xmx1024M -Xms1024M -XX:+PrintGCDetails     每次GC时打印详细信息
 */
public class MemoryUsed {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("maxMemory:"+maxMemory/1024/1024+"MB");
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("totalMemory:"+totalMemory/1024/1024+"MB");
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("freeMemory:"+freeMemory/1024/1024+"MB");
    }
}
