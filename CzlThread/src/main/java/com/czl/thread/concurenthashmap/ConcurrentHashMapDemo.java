package com.czl.thread.concurenthashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * czl
 * createTime:2019/11/24
 */
public class ConcurrentHashMapDemo {
    ConcurrentHashMap chm = new ConcurrentHashMap();



    public static void main(String[] args) {
    }

    /**
     * 普通集合可以使用Collections.synchronizedMap(XXX)来进行同步，保证线程安全
     */
    private void syncCollect() {
        Map map = new HashMap();
        Collections.synchronizedMap(map);

    }
}
