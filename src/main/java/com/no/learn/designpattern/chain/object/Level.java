/**
 * Copyright: no.com. All Rights Reserved.
 * @author: nohappy
 */
package com.no.learn.designpattern.chain.object;

public class Level {

    private int level;

    public Level(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object level) {

        return this.level == ((Level)level).getLevel();
    }
}