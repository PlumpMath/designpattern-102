package com.no.learn.designpattern.template;

/**
 * @author: nohappy  Date: 15/12/27 Time: 下午1:08
 */
public abstract class AbstractClass {

    // 避免被子类重写，声明为final
    public final void templateMethod() {
        doSomething();
        doAnything();
        hookMethod();
    }

    protected abstract void doSomething();

    protected abstract void doAnything();

    // 钩子方法，父类给出默认实现，子类可根据自己需要重写
    protected void hookMethod() {
        // 默认实现
        System.err.println("hook method, do default");
    }
}