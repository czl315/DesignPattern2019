package com.czl.design.factory.simplefactroy;

import com.czl.design.service.AliPay;
import com.czl.design.service.IPay;
import com.czl.design.service.WxPay;

public class SimpleFactroyByString {
    public IPay create(String name){
        if("ali".equals(name)){
            return new AliPay();
        }
        if("wx".equals(name)){
            return new WxPay();
        }
        return null;
    }
}
