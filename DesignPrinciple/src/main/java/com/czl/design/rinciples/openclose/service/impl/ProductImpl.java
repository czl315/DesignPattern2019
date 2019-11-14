package com.czl.design.rinciples.openclose.service.impl;

import com.czl.design.rinciples.openclose.service.IProduct;

public class ProductImpl implements IProduct {
    private Double price;

    ProductImpl(Double price){
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
