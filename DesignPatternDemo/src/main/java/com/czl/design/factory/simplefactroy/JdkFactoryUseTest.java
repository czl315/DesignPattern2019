package com.czl.design.factory.simplefactroy;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class JdkFactoryUseTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Logger logger = (Logger) LoggerFactory.getLogger(JdkFactoryUseTest.class);
        logger.info("test");
    }
}
