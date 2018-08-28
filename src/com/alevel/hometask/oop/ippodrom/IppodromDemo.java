package com.alevel.hometask.oop.ippodrom;

public class IppodromDemo {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        for (int i = 1; i <= 4; i++) {
            new Horse("HorseN" + i).start();
            try{
                Thread.currentThread().join();
            }
            catch(InterruptedException e) {
                System.out.printf("%s has been interrupted", Thread.currentThread().getName());
            }
        }



        System.out.println("Main thread finished...");

    }
}
