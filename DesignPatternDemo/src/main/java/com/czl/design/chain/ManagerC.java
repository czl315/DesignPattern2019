package com.czl.design.chain;

/**
 * czl
 * createTime:2019/11/21
 */
public class ManagerC extends ChainObj implements ChainAbstract {

    @Override
    public void doRequest(CzlEvent event) {
        if("3".equals(event.getType())){
            System.out.println("ManagerC-处理完成！");
        }else{
            System.out.println("ManagerC-无法处理-流程完成");
        }
    }
}
