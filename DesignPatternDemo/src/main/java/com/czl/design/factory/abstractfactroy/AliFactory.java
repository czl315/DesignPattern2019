package com.czl.design.factory.abstractfactroy;

import com.czl.design.service.AliPay;
import com.czl.design.service.AliPreOrder;
import com.czl.design.service.IPay;
import com.czl.design.service.IPreOrder;

public class AliFactory extends AbstractFactory {

    @Override
    public IPreOrder preOder() {
        return new AliPreOrder();
    }

    @Override
    public IPay pay() {
        return new AliPay();
    }


}
