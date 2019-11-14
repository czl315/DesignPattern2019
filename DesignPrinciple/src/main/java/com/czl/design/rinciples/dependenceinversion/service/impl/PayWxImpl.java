package com.czl.design.rinciples.dependenceinversion.service.impl;

import com.czl.design.rinciples.dependenceinversion.service.IPay;

public class PayWxImpl implements IPay {
    @Override
    public String pay() {
        return "微信支付";
    }
}
