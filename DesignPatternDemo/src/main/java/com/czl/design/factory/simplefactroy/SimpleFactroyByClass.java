package com.czl.design.factory.simplefactroy;

import com.czl.design.service.IPay;

/**
 * 工厂创建对象-根据传参
 */
public class SimpleFactroyByClass {
    public IPay create(Class clz) {
        IPay rs = null;
        try{
             rs =  (IPay)clz.newInstance();
        }catch (Exception e){
//            e.printStackTrace();
            System.out.println("未知类："+clz.toString());
        }
        return rs;
    }
}
