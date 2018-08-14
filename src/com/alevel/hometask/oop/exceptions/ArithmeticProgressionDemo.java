package com.alevel.hometask.oop.exceptions;

public class ArithmeticProgressionDemo {
    public static void main(String[] args) {
        try {
            ArithmeticProgression myArithmProgr = new ArithmeticProgression(2, 5);
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
//            System.out.println(e);
        }
        try {
            int n = myArithmProgr.calculate(2);
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
//            System.out.println(e);
        }

        System.out.println(n);
    }
}
