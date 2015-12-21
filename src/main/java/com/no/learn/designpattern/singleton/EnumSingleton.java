/* ****************************************************
 * Copyright (C) 2015 iQIYI.COM - All Rights Reserved
 *
 * This file is part of search.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): Yuran Zhang <zhangyuran@qiyi.com>
 *
 * ******************************************************/

package com.no.learn.designpattern.singleton;

public enum EnumSingleton {
    INSTANCE("EnumSingleton");

    private String name;

    EnumSingleton(String name) {
        this.name = name;
    }
}
