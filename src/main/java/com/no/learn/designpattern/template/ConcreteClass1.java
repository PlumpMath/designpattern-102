package com.no.learn.designpattern.template;

/**
 * @author: nohappy  Date: 15/12/27 Time: 下午1:15
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.err.println("do something in ConcreteClass1");
    }

    @Override
    protected void doAnything() {
        System.err.println("do anything in ConcreteClass1");
    }
}