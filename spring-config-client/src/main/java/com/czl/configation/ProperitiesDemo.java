package com.czl.configation;

import java.io.IOException;
import java.util.Properties;

/**
 * czl
 * createTime:2019/10/11
 */
public class ProperitiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name", "czl");
        properties.setProperty("age", "36");

        try {
            properties.storeToXML(System.out, "注释", "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
