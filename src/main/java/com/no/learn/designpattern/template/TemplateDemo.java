package com.no.learn.designpattern.template;

/**
 * @author: nohappy  Date: 15/12/27 Time: 下午1:19
 */
public class TemplateDemo {

    public static void main(String[] args) {
        AbstractClass concreteClass1 = new ConcreteClass1();
        AbstractClass concreteClass2 = new ConcreteClass2();

        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}