package com.alevel.hometask.oop.module;

import java.util.Random;

public abstract class Waggon {
    private int load;
    private String type;

    public Waggon(int maxLoading) {
        Random rand = new Random();
        this.load = rand.nextInt(maxLoading);
    }

    public Waggon() {}

    public void setType(String type) {
        this.type = type;
    }

    public int getLoad() {
        return load;
    }
}
