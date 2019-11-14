package com.czl.design.rinciples.openclose;

import com.czl.design.rinciples.openclose.service.impl.ProductDiscountImpl;

public class OcpTest {
    public static void main(String[] args) {
        ProductDiscountImpl product = new ProductDiscountImpl((double) 100);
        Double discountPrice = product.getPrice();
        System.out.println("折扣价格："+discountPrice);
        Double originalPrice= product.getOriginalPrice();
        System.out.println("原始价格："+originalPrice);
    }
}
