package com.czl.design.factory.simplefactroy;

import com.czl.design.service.IPay;

public class SimpleFactroyByClassName {
    public IPay create(String name) {
        IPay rs = null;
        try{
             rs =  (IPay)Class.forName(name).newInstance();
        }catch (Exception e){
//            e.printStackTrace();
            System.out.println("未知类："+name);
        }
        return rs;
    }
}
