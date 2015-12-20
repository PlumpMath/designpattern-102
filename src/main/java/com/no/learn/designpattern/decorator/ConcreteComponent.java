/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.decorator;

public class ConcreteComponent implements Component {

    @Override public void operation() {
        System.out.println("This is an operation of concreteComponent.");
    }
}
