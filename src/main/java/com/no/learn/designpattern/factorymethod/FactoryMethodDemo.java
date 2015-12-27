/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.factorymethod;

import com.no.learn.designpattern.factorymethod.multi.FactoryA;
import com.no.learn.designpattern.factorymethod.multi.FactoryB;
import com.no.learn.designpattern.factorymethod.normal.ConcreteFactory;
import com.no.learn.designpattern.factorymethod.normal.Factory;
import com.no.learn.designpattern.factorymethod.product.Product;
import com.no.learn.designpattern.factorymethod.product.ProductA;
import com.no.learn.designpattern.factorymethod.product.ProductB;
import com.no.learn.designpattern.factorymethod.simple.StaticFactory;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        playNormalDemo();
        playSimpleDemo();
        playMultiDemo();
    }

    public static void playNormalDemo() {
        System.out.println("=======================> playNormalDemo");
        Factory factory = new ConcreteFactory();
        Product productA = factory.createProduct(ProductA.class);
        Product productB = factory.createProduct(ProductB.class);

        productA.methodA();
        productA.methodB();

        productB.methodA();
        productB.methodB();
    }

    public static void playSimpleDemo() {
        System.out.println("=======================> playSimpleDemo");
        Product productA = StaticFactory.createProduct(ProductA.class);
        Product productB = StaticFactory.createProduct(ProductB.class);

        productA.methodA();
        productA.methodB();

        productB.methodA();
        productB.methodB();
    }

    public static void playMultiDemo() {
        System.out.println("=======================> playMultiDemo");
        Product productA = new FactoryA().createProduct();
        Product productB = new FactoryB().createProduct();

        productA.methodA();
        productA.methodB();

        productB.methodA();
        productB.methodB();
    }
}
