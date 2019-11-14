package com.czl.design.rinciples.openclose.service.impl;

public class ProductDiscountImpl extends ProductImpl {
    private Double price;

    public ProductDiscountImpl(Double price){
        super(price);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price*0.6;
    }

    /**
     * 获取原始价格
     * @return
     */
    public Double getOriginalPrice(){
        return price;
    }
}
