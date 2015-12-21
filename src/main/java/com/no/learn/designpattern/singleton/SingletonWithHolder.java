/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.singleton;

/**
 * 同样利用了class loader的机制来保证初始化instance时只有一个线程
 * 非饿汉：
 * 即使SingletonWithHolder被加载也不会初始化instance，因为SingletonHolder类没有被主动使用
 * 只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance
 */
public class SingletonWithHolder {

    private static class SingletonHolder {
        private static final SingletonWithHolder INSTANCE = new SingletonWithHolder("SingletonWithHolder");
    }


    private String name;

    private SingletonWithHolder(String name) {
        this.name = name;
    }

    public static SingletonWithHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
