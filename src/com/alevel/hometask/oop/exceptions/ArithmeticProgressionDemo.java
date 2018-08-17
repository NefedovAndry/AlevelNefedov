package com.alevel.hometask.oop.exceptions;

public class ArithmeticProgressionDemo {
    public static void main(String[] args) {
        ArithmeticProgression myArithmProgr;
        try {
            myArithmProgr = new ArithmeticProgression(2, 5);
            int n = myArithmProgr.calculate(2);
            System.out.println(n);
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
            return;
        }
        try {
            int n = myArithmProgr.calculate(2);
            System.out.println(n);
        } catch (ProgressionConfigurationException e) {
            e.printStackTrace();
        }
    }
}
