package com.alevel.hometask.oop.exceptions;

public class ArithmeticProgression {
    private final int INITIAL;
    private final int STEP;

    public ArithmeticProgression(int INITIAL, int STEP) throws ProgressionConfigurationException {
        if (STEP == 0) {
            throw new ProgressionConfigurationException("STEP == 0");
        } else {
            this.INITIAL = INITIAL;
            this.STEP = STEP;
        }
    }

    public int calculate(int n) throws ProgressionConfigurationException {
        if (n <= 0) {
            throw new ProgressionConfigurationException("n <= 0");
        } else
            return INITIAL + STEP * n;
    }
}
