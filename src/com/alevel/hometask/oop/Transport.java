//package com.alevel.hometask.oop;

public enum Transport {

    Train(1), Car(2), Plane(5);

    private int transIndex;

    Transport(int transIndex) {
        this.transIndex = transIndex;
    }

    public int getTransIndex() {
        return transIndex;
    }
}
