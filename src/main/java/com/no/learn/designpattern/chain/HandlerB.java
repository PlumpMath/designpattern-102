package com.no.learn.designpattern.chain;

import com.no.learn.designpattern.chain.Handler;
import com.no.learn.designpattern.chain.object.Level;
import com.no.learn.designpattern.chain.object.Request;
import com.no.learn.designpattern.chain.object.Response;

/**
 * @author: suolongxiang  Date: 15/12/20 Time: 下午4:01
 */
public class HandlerB extends Handler {
    @Override
    protected Level getLevel() {
        return new Level(2);
    }

    @Override
    protected Response handle(Request request) {
        return new Response("handler B");
    }
}