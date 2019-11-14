package com.czl.design.factory.factroymethod;

import com.czl.design.service.IPay;

public abstract class FactoryAtractClass {
    public void preCreate(){
        System.out.println("抽象父类的预先处理方法。。。");
    }

    public abstract IPay create();
}
