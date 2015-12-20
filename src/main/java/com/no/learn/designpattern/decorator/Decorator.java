/**
 * Copyright: no.com. All Rights Reserved.
 * @author: nohappy
 */

package com.no.learn.designpattern.decorator;

public abstract class Decorator implements Component {
    Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

}
