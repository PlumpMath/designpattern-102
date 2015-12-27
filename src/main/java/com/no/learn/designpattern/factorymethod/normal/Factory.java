/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.factorymethod.normal;

import com.no.learn.designpattern.factorymethod.product.Product;

public abstract class Factory {

    public abstract <P extends Product> P createProduct(Class<P> productClass);

}
