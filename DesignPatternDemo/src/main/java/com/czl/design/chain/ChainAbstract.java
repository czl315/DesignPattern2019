package com.czl.design.chain;

/**
 * czl
 * createTime:2019/11/21
 * 责任链抽象
 */
public  interface ChainAbstract {
    public void doRequest(CzlEvent event);
}
