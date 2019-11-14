package com.czl.design.rinciples.dependenceinversion.service.impl;

import com.czl.design.rinciples.dependenceinversion.service.IPay;

public class PayAliImpl implements IPay {
    @Override
    public String pay() {
        return "支付宝支付";
    }
}
