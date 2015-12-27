/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.factorymethod.normal;

import com.no.learn.designpattern.factorymethod.product.Product;

public class ConcreteFactory extends Factory {

    @Override public <P extends Product> P createProduct(Class<P> productClass) {
        Product product = null;

        try {
            product = (Product) Class.forName(productClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (P) product;
    }

}
