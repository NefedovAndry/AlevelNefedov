package com.alevel.hometask.oop;

public class Iron extends AbstractSubstance {

    private final double maxSolidTemperature = 1538.85;
    private final double maxLiquidTemperature = 2861;

    @Override
    public String toString() {
        return "Iron";
    }

    @Override
    protected double getMaxSolidTemperature() {
        return maxSolidTemperature;
    }

    @Override
    protected double getMaxLiquidTemperature() {
        return maxLiquidTemperature;
    }
}
