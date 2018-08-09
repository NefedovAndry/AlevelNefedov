package com.alevel.hometask.oop.module;

public class PassengerFirstClass extends Waggon {

    public PassengerFirstClass() {
        super(100);
        super.setType("PassengerFirstClass");
    }

    public String toString() {
        return "[:passndr:1cl:" + getLoad() + "]=";
    }
}
