package com.czl.design.chain;

/**
 * czl
 * createTime:2019/11/21
 */
public class ManagerB extends ChainObj implements ChainAbstract {
    ManagerC managerC = new ManagerC();
    @Override
    public void doRequest(CzlEvent event) {
        if("2".equals(event.getType())){
            System.out.println("ManagerB-处理完成！");
        }else{
            System.out.println("ManagerB-提交-ManagerC-处理。");
            managerC.doRequest(event);
        }
    }
}
