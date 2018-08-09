package com.alevel.hometask.oop.module;

import java.util.Random;

public class Cargo extends Waggon {
    private double load;

    public Cargo() {
        Random rand = new Random();
        this.load = rand.nextDouble()*100;
        super.setType("Cargo");
    }

    @Override
    public String toString() {
        return "[:cargo:" + (int) load + "%]=";
    }
}
