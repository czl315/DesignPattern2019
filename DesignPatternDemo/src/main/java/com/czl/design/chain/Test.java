package com.czl.design.chain;

/**
 * czl
 * createTime:2019/11/21
 */
public class Test {
    public static void main(String[] args) {
        CzlEvent czlEvent = new CzlEvent();
//        czlEvent.setType("1");
//        czlEvent.setType("2");
//        czlEvent.setType("3");
        czlEvent.setType("4");
        new ManagerA().doRequest(czlEvent);
    }
}
