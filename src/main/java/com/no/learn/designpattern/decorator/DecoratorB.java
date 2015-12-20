/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.decorator;

public class DecoratorB extends Decorator {

    public DecoratorB(Component component) {
        super(component);
    }

    @Override public void operation() {
        component.operation();
        System.out.println("This is an added operation of decoratorB.");
    }
}
