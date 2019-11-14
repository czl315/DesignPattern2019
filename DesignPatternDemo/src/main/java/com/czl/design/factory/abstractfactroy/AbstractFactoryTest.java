package com.czl.design.factory.abstractfactroy;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactoryFace factory = new AliFactory();
        System.out.println(factory.preOder());
        System.out.println(factory.pay().pay());
    }
}
