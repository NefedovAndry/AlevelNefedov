package com.alevel.hometask.oop.module;

public class PassengerSecondClass extends Waggon {

    public PassengerSecondClass() {
        super(200);
        super.setType("PassengerSecondClass");
    }

    public String toString() {
        return "[:passndr:2cl:" + super.getLoad() + "]=";
    }
}
