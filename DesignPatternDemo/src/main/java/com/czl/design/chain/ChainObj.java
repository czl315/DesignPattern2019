package com.czl.design.chain;

/**
 * czl
 * createTime:2019/11/21
 */
public class ChainObj {
    private ChainObj nextChainObj;//下一个处理链的对象

    public ChainObj getNextChainObj() {
        return nextChainObj;
    }

    public void setNextChainObj(ChainObj nextChainObj) {
        this.nextChainObj = nextChainObj;
    }
}
