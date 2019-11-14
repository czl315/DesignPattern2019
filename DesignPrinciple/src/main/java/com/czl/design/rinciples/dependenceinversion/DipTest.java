package com.czl.design.rinciples.dependenceinversion;

import com.czl.design.rinciples.dependenceinversion.service.impl.PayAliImpl;
import com.czl.design.rinciples.dependenceinversion.service.impl.PayWxImpl;

public class DipTest extends PaySelectorConstructor {
    public static void main(String[] args) {
//        PaySelector paySelector = new PaySelector();
//        System.out.println(paySelector.pay(new PayAliImpl()));
//        System.out.println(paySelector.pay(new PayWxImpl()));

        //构造器方式
        PaySelectorConstructor paySelectorConstructorAli = new PaySelectorConstructor(new PayAliImpl());
        System.out.println(paySelectorConstructorAli.pay());
        PaySelectorConstructor paySelectorConstructorWX = new PaySelectorConstructor(new PayWxImpl());
        System.out.println(paySelectorConstructorWX.pay());

//        //setter方式
//        PaySelectorSetter paySelectorSetterAli = new PaySelectorSetter();
//        paySelectorSetterAli.setPay(new PayAliImpl());
//        System.out.println(paySelectorSetterAli.pay());
//        PaySelectorSetter paySelectorSetterWx = new PaySelectorSetter();
//        paySelectorSetterWx.setPay(new PayWxImpl());
//        System.out.println(paySelectorSetterWx.pay());
    }
}
