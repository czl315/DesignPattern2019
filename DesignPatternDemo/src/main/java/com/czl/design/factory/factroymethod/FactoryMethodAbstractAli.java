package com.czl.design.factory.factroymethod;

import com.czl.design.service.AliPay;
import com.czl.design.service.IPay;

public class FactoryMethodAbstractAli extends FactoryAtractClass {

    @Override
    public IPay create() {
        return new AliPay();
    }
}
