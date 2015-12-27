/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.factorymethod.multi;

import com.no.learn.designpattern.factorymethod.product.Product;
import com.no.learn.designpattern.factorymethod.product.ProductA;

public class FactoryA extends Factory {

    @Override public Product createProduct() {
        return new ProductA();
    }
}
