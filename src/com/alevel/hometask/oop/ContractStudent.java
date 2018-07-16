package com.alevel.hometask.oop;

public class ContractStudent extends Student {
    private double contractCost;

    ContractStudent(String name, int age, double contractCost) {
        super(name, age);
        this.contractCost = contractCost;
    }

    public double getContractCost() {
        return contractCost;
    }
}
