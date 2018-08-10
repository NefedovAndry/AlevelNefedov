package com.alevel.hometask.oop.module;

import java.util.LinkedList;

public class Train {

    private int number;
    private City checkOut;
    private City checkIn;
    private LinkedList<Waggon> train;

    Train(int number) {
        this.number = number;
        this.train = new LinkedList<>();
        train.add(new Locomotive());
    }

    public void add(int quantity, String type) throws WrongTypeOfWaggonException {
        switch (type) {
            case "Cargo":
                for (int i = 0; i < quantity; i++) {
                    train.add(new Cargo());
                }
                break;
            case "PassengerFirstClass":
                for (int i = 0; i < quantity; i++) {
                    train.add(new PassengerFirstClass());
                }
                break;
            case "PassengerSecondClass":
                for (int i = 0; i < quantity; i++) {
                    train.add(new PassengerSecondClass());
                }
                break;
            default:
                throw new WrongTypeOfWaggonException();
        }
    }

    public void setCheckOut(City checkOut) throws WrongCheckOutCheckInException {
        if (checkOut == this.checkIn) {
            throw new WrongCheckOutCheckInException();
        } else {
            this.checkOut = checkOut;
        }
    }

    public void setCheckIn(City checkIn) throws WrongCheckOutCheckInException {
        if (checkIn == this.checkOut) {
            throw new WrongCheckOutCheckInException();
        } else {
            this.checkIn = checkIn;
        }
    }

    public int size(){
        return train.size() - 1;
    }

    public void scheme() {
        for (Waggon i : train) {
            System.out.print(i);
        }
    }

    public void info() {
        System.out.println("Train N" + number + " goes from " + checkOut.toString() + " to " + checkIn.toString());
        System.out.println("Train N" + number + " has " + size() + " vans.");
        System.out.println("Train N" + number + " scheme:");
        scheme();
    }

}
