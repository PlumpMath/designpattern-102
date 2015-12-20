/**
 * Copyright: no.com. All Rights Reserved.
 * @author: nohappy
 */
package com.no.learn.designpattern.chain;

import com.no.learn.designpattern.chain.Handler;
import com.no.learn.designpattern.chain.object.Level;
import com.no.learn.designpattern.chain.object.Request;
import com.no.learn.designpattern.chain.object.Response;


public class HandlerA extends Handler {

    @Override
    protected Level getLevel() {
        return new Level(1);
    }

    @Override
    protected Response handle(Request request) {
        return new Response("handler A");
    }
}