/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.factorymethod.product;

public abstract class Product {

    public void methodA() {
        System.out.println("This is methodA in Product.");
    }

    public abstract void methodB();

}
