package com.line.code.designmodel.factory.function;


import com.line.code.designmodel.factory.Bean.Apple;
import com.line.code.designmodel.factory.Bean.Fruits;
import com.line.code.designmodel.factory.Bean.Orange;
import com.line.code.designmodel.factory.Bean.Pear;

//工厂方法
public class FactoryFunction {

    public Fruits getApple() {
        return new Apple();
    }

    public Fruits getOrange() {
        return new Orange();
    }

    public Fruits getPear() {
        return new Pear();
    }
}
