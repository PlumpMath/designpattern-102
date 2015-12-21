/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.singleton;

/**
 * 利用了class loader的机制来保证初始化instance时只有一个线程
 * 饿汉：每次类加载后就实例化唯一对象instance
 */
public class SimpleSingleton {

    private static SimpleSingleton instance = new SimpleSingleton("SimpleSingleton");

    private String name;

    private SimpleSingleton(String name) {
        this.name = name;
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }

}
