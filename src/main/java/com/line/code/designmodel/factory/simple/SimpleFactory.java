package com.line.code.designmodel.factory.simple;

import com.line.code.designmodel.factory.Bean.Apple;
import com.line.code.designmodel.factory.Bean.Fruits;
import com.line.code.designmodel.factory.Bean.Orange;
import com.line.code.designmodel.factory.Bean.Pear;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public Fruits getBean(String name) {
        if ("apple".equals(name)) {
            return new Apple();
        } else if ("orange".equals(name)) {
            return new Orange();
        } else if ("pear".equals(name)) {
            return new Pear();
        } else {
            return null;
        }
    }
}
