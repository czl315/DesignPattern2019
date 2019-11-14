package com.czl.design.delegate;

/**
 * czl
 * createTime:2019/10/8
 */
public class GatewayTest {
    public static void main(String[] args) {
        Gateway gateway = new Gateway();
        gateway.doCommand("支付",new WalletService());
    }
}
