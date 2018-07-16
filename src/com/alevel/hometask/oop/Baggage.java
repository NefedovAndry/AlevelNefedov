//package com.alevel.hometask.oop;

public class Baggage {

    private String name;
    private double volume;
    private double mass;

    public Baggage(String name, double volume, double mass) {
        this.name = name;
        this.volume = volume;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getMass() {
        return mass;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setVolume(double volume) {
    	this.volume = volume;
    }
    
    public void setMass(double mass) {
    	this.mass = mass;
    }

    @Override
    public String toString() {
        return name;
    }
}