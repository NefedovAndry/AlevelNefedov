package com.alevel.hometask.oop;

public class Oxygen extends AbstractSubstance {

    private final double maxSolidTemperature = -218.35;
    private final double maxLiquidTemperature = -182.96;

    @Override
    public String toString() {
        return "Oxygen";
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
