package com.czl.design.delegate;

/**
 * czl
 * createTime:2019/10/8
 */
public class Gateway {
    public String doCommand(String command ,WalletService walletService){
        walletService.doSomething(command);
        return null;
    }

}
