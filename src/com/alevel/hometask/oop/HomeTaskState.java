package com.alevel.hometask.oop;

import java.util.Scanner;

public class HomeTaskState {

    public static void main(String[] args) {

        Substance substance = null;

        System.out.println("Choose a substance:" +
                " 1 - oxygen;" +
                " 2 - iron;" +
                " 3 - water");
        Scanner scan = new Scanner(System.in);
        do {
            int select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("You choose oxygen");
                    substance = new Oxygen();
                    break;
                case 2:
                    System.out.println("You choose iron");
                    substance = new Iron();
                    break;
                case 3:
                    System.out.println("You choose water");
                    substance = new Water();
                    break;
                default:
                    System.out.println("Your input is illegal. Repeat the select.");
                    //               return;
            }
        } while (substance == null);
        System.out.println("Choose your temperature shift to see a substance state. If you'll want to stop " +
                "choose 0.");
        double temperatureShift;
        while (true) {
            temperatureShift = scan.nextDouble();
            if (temperatureShift == 0) break;
            System.out.println("The temperature of the " + substance.toString() + " is " + substance.getTemperature()
                    + ". After changing temperature to " + temperatureShift + "C the state of substance will be " +
            substance.heatUp(temperatureShift) + ".");
        }
    }

}
