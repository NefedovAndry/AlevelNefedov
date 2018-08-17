package com.alevel.hometask.oop.petshouse;

import java.util.Arrays;

public class PetsHouse <Pet> {
    private Object[] house;
    private int size;

    PetsHouse() {
        this.house = new Object[1];
        this.size = 0;
    }

    private void houseIncreasing() {
        this.house = Arrays.copyOf(house, house.length * 2);
    }

    public void addPet(Pet pet) {
        if (size == house.length) houseIncreasing();
        this.house[size] = pet;
        this.size++;
    }

    @SuppressWarnings("unchecked")
    public Pet get(int index) {
        return (Pet) house[index];
    }

    public void viewHouse() {
        for (int i = 0; i < size; i++) {
            System.out.println(house[i].toString());
        }
    }
}
