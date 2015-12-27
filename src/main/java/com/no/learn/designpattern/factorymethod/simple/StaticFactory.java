/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.factorymethod.simple;

import com.no.learn.designpattern.factorymethod.product.Product;

// alias SimpleFactory: 不适合开闭原则
public class StaticFactory {

    public static <P extends Product> P createProduct(Class<P> productClass) {
        Product product = null;

        try {
            product = (Product) Class.forName(productClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (P) product;
    }
}
