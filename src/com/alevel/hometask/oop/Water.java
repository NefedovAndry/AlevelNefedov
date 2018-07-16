package com.alevel.hometask.oop;

public class Water extends AbstractSubstance {

    private final double maxSolidTemperature = 0;
    private final double maxLiquidTemperature = 100;

    @Override
    public String toString() {
        return "Water";
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
