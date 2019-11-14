package com.czl.design.factory.factroymethod;

import com.czl.design.service.IPay;
import com.czl.design.service.WxPay;

public class FactoryMethodWx implements IFactory {
    @Override
    public IPay create() {
        return new WxPay();
    }
}
