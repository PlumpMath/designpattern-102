/**
 * Copyright: no.com. All Rights Reserved.
 * @author: nohappy
 */

package com.no.learn.designpattern.chain;

import com.no.learn.designpattern.chain.object.Level;
import com.no.learn.designpattern.chain.object.Request;
import com.no.learn.designpattern.chain.object.Response;

public abstract class Handler {

    private Handler next;

    public Response handleRequest(Request request) {
        if (getLevel().equals(request.getLevel())) {
            return handle(request);
        } else if (next != null) {
            return next.handleRequest(request);
        } else {
            return null;
        }
    }

    protected abstract Level getLevel();

    protected abstract Response handle(Request request);

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}