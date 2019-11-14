package com.czl.design.rinciples.dependenceinversion;

import com.czl.design.rinciples.dependenceinversion.service.IPay;

public class PaySelectorSetter {
    private IPay pay;

    public void setPay(IPay pay) {
        this.pay = pay;
    }

    public String pay(){
        return pay.pay();
    }
}
