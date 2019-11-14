package com.czl.design.delegate;

/**
 * czl
 * createTime:2019/10/8
 */
public class WalletService {
    WalletService(){
    }

    public String doSomething(String command){
        if("订单".equals(command)){
            OrderDao dao = new OrderDao();
            dao.save();
        }
        if("支付".equals(command)){
            PayDao dao = new PayDao();
            dao.save();
        }
        return null;
    }
}
