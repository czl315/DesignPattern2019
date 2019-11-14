package com.czl.design.factory.abstractfactroy;

import com.czl.design.service.IPay;
import com.czl.design.service.IPreOrder;

public interface AbstractFactoryFace {
    public abstract IPreOrder preOder();
    public abstract IPay pay();
}
