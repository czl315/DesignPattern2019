package com.czl.design.factory.factroymethod;

import org.slf4j.LoggerFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factoryAli = new FactoryMethodAli();
        System.out.println(factoryAli.create().pay());
        IFactory factoryWx = new FactoryMethodWx();
        System.out.println(factoryWx.create().pay());

        FactoryMethodAbstractAli factoryAliAbs = new FactoryMethodAbstractAli();
//        factoryAliAbs.preCreate();
        System.out.println(factoryAliAbs.create().pay());

        LoggerFactory.getLogger(FactoryMethodTest.class);
    }
}
