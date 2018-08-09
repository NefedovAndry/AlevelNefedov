package com.alevel.hometask.oop.module;

public class TrainDemo {
    public static void main(String[] args) {

        Train trainN6 = new Train(6);
        try {
            trainN6.add(2, "PassengerSecondClass");
            trainN6.add(3, "Cargo");
            trainN6.add(1,"PassengerFirstClass");
        } catch (WrongTypeOfWaggonException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        try {
            trainN6.setCheckOut(City.KHARKOV);
            trainN6.setCheckIn(City.KIEV);
        } catch (WrongCheckOutCheckInException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        trainN6.info();
    }
}
