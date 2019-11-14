package com.czl.design.service;

public class WxPay implements IPay {

    @Override
    public String pay() {
        return "微信支付";
    }
}
