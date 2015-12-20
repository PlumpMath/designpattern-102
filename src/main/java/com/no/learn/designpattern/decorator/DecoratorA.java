/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.decorator;

public class DecoratorA extends Decorator {

    public DecoratorA(Component component) {
        super(component);
    }

    @Override public void operation() {
        component.operation();
        addOperation();
    }

    private void addOperation() {
        System.out.println("This is an added operation of decoratorA.");
    }
}
