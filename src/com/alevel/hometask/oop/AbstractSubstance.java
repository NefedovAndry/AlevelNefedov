package com.alevel.hometask.oop;

public abstract class AbstractSubstance implements Substance {

    private double temperature = 20;

    protected abstract double getMaxSolidTemperature();

    protected abstract double getMaxLiquidTemperature();
	
	public double getTemperature() {
		return temperature;
	}

    public State heatUp(double t) {
		temperature += t;
		return getState();
	}
	
	private State getState() {
		if (temperature <= getMaxSolidTemperature()) {
            return State.SOLID;
        } else if (temperature > getMaxSolidTemperature() && temperature <= getMaxLiquidTemperature()) {
            return State.LIQUID;
        } else if (temperature > getMaxLiquidTemperature()) {
            return State.GAS;
        } else return State.GAS;
	}
}
