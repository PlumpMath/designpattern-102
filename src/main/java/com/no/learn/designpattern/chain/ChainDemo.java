package com.no.learn.designpattern.chain;

import com.no.learn.designpattern.chain.object.Level;
import com.no.learn.designpattern.chain.object.Request;

/**
 * @author: suolongxiang  Date: 15/12/20 Time: 下午4:03
 */
public class ChainDemo {

    public static void main(String[] args){
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        handlerA.setNext(handlerB);

        Request request = new Request();
        Level level = new Level(2);
        request.setLevel(level);

        System.err.println(handlerA.handleRequest(request).getReponse());
    }
}