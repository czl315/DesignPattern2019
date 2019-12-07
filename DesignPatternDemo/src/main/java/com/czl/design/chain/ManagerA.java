package com.czl.design.chain;

/**
 * czl
 * createTime:2019/11/21
 */
public class ManagerA extends ChainObj implements ChainAbstract {

    ManagerB managerB = new ManagerB();

    @Override
    public void doRequest(CzlEvent event) {
        if("1".equals(event.getType())){
            System.out.println("ManagerA-处理完成！");
        }else{
            System.out.println("ManagerA-提交-ManagerB-处理。");
            managerB.doRequest(event);
        }
    }
}
