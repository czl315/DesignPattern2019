package com.czl.design.rinciples.dependenceinversion;

import com.czl.design.rinciples.dependenceinversion.service.IPay;

public class PaySelectorConstructor {
    private IPay pay;
    PaySelectorConstructor(){
    }
    public PaySelectorConstructor(IPay pay){
        this.pay = pay;
    }

    public String pay(){
        return pay.pay();
    }
}
