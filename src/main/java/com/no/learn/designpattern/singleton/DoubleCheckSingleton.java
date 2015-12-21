/**
 * Copyright: no.com. All Rights Reserved.
 * @author: noworry
 */

package com.no.learn.designpattern.singleton;

/**
 * 使用volatile的原因：
 * new DoubleCheckSingleton(...)并非是一个原子操作，事实上在JVM中这句话大概做了下面3件事情：
 * 1.给DoubleCheckSingleton分配内存
 * 2.调用DoubleCheckSingleton的构造函数来初始化成员变量，形成实例
 * 3.将DoubleCheckSingleton对象指向分配的内存空间（执行完这步instance才是非null了）
 *
 * 但是在JVM的即时编译器中存在指令重排序的优化，也就是说上面的第二步和第三步的顺序是不能保证的，最终的执行顺序可能是 1-2-3 也可能是 1-3-2
 * 如果是后者，则在3执行完毕、2未执行之前，被线程二抢占了，这时instance已经是非null了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错
 *
 * 对此，我们只需要把instance声明成volatile就可以了
 * 使用volatile有两个功用：
 * 1）这个变量不会在多个线程中存在复本，直接从内存读取
 * 2）这个关键字会禁止指令重排序优化。也就是说，在volatile变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），读操作不会被重排序到内存屏障之前
 * 但是，这个事情仅在Java 1.5版后有用，1.5版之前用这个变量也有问题，因为老版本的Java的内存模型是有缺陷的
 *
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance;

    private String name;

    private DoubleCheckSingleton(String name) {
        this.name = name;
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton("DoubleCheckSingleton");
                }
            }
        }

        return instance;
    }

}
