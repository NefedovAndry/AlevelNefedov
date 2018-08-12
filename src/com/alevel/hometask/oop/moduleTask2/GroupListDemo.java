package com.alevel.hometask.oop.moduletaskstudents;

import java.util.ArrayList;
import java.util.Random;

public class GroupListDemo {
    private static ArrayList<Integer> randomRates() {
        ArrayList<Integer> rates = new ArrayList<>(5);
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            rates.add(i,rand.nextInt(3) + 3);
        }
        return rates;
    }

    public static void main(String[] args) {
        GroupList groupN411 = new GroupList(411);
        groupN411.addStudent("Nefedov Andry");
        groupN411.addStudent("Ivanov Ivan");
        groupN411.addStudent("Petrov Petr");
        groupN411.addStudent("Sidorov Sidr");
        groupN411.addRates("Nefedov Andry", randomRates());
        groupN411.addRates("Ivanov Ivan", randomRates());
        groupN411.addRates("Petrov Petr", randomRates());
        groupN411.addRates("Sidorov Sidr", randomRates());
        groupN411.showRates();
        groupN411.showAwards();
    }
}
