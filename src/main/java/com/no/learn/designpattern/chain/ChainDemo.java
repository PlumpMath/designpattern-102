/**
 * Copyright: no.com. All Rights Reserved.
 * @author: nohappy
 */

package com.no.learn.designpattern.chain;

import com.no.learn.designpattern.chain.object.Level;
import com.no.learn.designpattern.chain.object.Request;

public class ChainDemo {

    public static void main(String[] args){
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        handlerA.setNext(handlerB);

        Request request = new Request();
        Level level = new Level(2);
        request.setLevel(level);

        System.err.println(handlerA.handleRequest(request).getResponse());
    }
}