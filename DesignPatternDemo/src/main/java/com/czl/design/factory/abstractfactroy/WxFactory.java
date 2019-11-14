package com.czl.design.factory.abstractfactroy;

import com.czl.design.service.*;

public class WxFactory implements AbstractFactoryFace {
    @Override
    public IPreOrder preOder() {
        return new WxPreOrder();
    }

    @Override
    public IPay pay() {
        return new WxPay();
    }
}
