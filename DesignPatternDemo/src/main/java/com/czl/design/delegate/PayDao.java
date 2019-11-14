package com.czl.design.delegate;

/**
 * czl
 * createTime:2019/10/8
 */
public class PayDao implements IDao {
    @Override
    public void save() {
        System.out.println("保存-支付");
    }
}
