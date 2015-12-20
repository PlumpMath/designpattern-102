/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Component decoratorB = new DecoratorB(new DecoratorA(new ConcreteComponent()));
        decoratorB.operation();
    }
}
