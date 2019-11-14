package com.czl.design.rinciples.dependenceinversion;

import com.czl.design.rinciples.dependenceinversion.service.IPay;

public class PaySelector {
    public String pay(IPay pay){
        return pay.pay();
    }
}
