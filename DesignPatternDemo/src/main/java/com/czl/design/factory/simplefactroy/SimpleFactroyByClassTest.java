package com.czl.design.factory.simplefactroy;

import com.czl.design.service.AliPay;
import com.czl.design.service.WxPay;

public class SimpleFactroyByClassTest {
    public static void main(String[] args) {
        SimpleFactroyByClass simpleFactroy = new SimpleFactroyByClass();
        System.out.println(simpleFactroy.create(AliPay.class));
        System.out.println(simpleFactroy.create(WxPay.class));
        System.out.println(simpleFactroy.create("aaa".getClass()));
    }
}
