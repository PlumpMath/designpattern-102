/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.singleton;

public enum EnumSingleton {
    INSTANCE("EnumSingleton");

    private String name;

    EnumSingleton(String name) {
        this.name = name;
    }
}
