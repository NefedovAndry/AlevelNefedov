package com.alevel.hometask.oop.exceptions;

public class ArithmeticProgressionDemo {
    public static void main(String[] args) {
        try {
            ArithmeticProgression myArithmProgr = new ArithmeticProgression(2, 5);
        /*} catch (ProgressionConfigurationException e) {
            System.err.println(e);
        }
        try {*/
            int n = myArithmProgr.calculate(2);
            System.out.println(n);
        } catch (ProgressionConfigurationException e) {
            System.err.println(e);
        }
    }
}
