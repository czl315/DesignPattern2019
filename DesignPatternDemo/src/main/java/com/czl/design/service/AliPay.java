package com.czl.design.service;

public class AliPay implements IPay {

    @Override
    public String pay() {
        return "支付宝支付";
    }
}
