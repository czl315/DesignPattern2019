package com.czl.jvm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * czl
 * createTime:2019/11/14
 * -Xms1M -Xmx10M -XX:+HeapDumpOnOutOfMemoryError-XX:+PrintGCDetails
 * -XX:+HeapDumpOnOutOfMemoryError      当首次遭遇OOM时导出此时堆中相关信息
 * -XX:+PrintGCDetails     每次GC时打印详细信息
 */
public class OomTest1 {
    byte[] bytes = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        int count = 0;
        try {
            List list = new ArrayList();
            for (int i = 0; i < 1000000; i++) {
                list.add(new OomTest1());
                count++;
            }
        } catch (Throwable e) {
            System.out.println("创建对象个数count:" + count);
            e.printStackTrace();
        }

    }
}
