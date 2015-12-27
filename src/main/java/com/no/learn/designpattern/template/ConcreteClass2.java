package com.no.learn.designpattern.template;

/**
 * @author: nohappy  Date: 15/12/27 Time: 下午1:16
 */
public class ConcreteClass2 extends AbstractClass {

    @Override
    protected void doSomething() {
        System.err.println("do something in ConcreteClass2");
    }

    @Override
    protected void doAnything() {
        System.err.println("do anything in ConcreteClass2");
    }

    @Override
    protected void hookMethod() {
        System.err.println("hook method, do ConcreteClass2");
    }
}