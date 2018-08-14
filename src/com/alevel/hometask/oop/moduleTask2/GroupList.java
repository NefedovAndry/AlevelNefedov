package com.alevel.hometask.oop.moduletaskstudents;

import java.util.*;

public class GroupList {
    private static final double AWARD = 2000;
    private int number;
    private Map<String, ArrayList<Integer>> group;

    public GroupList(int number) {
        this.number = number;
        this.group = new HashMap<>();
    }

    public void addGroupList(Map<String, ArrayList<Integer>> newGroupList) {
        this.group.putAll(newGroupList);
    }

    public void addStudent(String name) {
        this.group.put(name, new ArrayList<Integer>(5));
    }

    public void addRates(String name, ArrayList<Integer> rates) {
        this.group.put(name, rates);
    }

    public void addRate(String name, int rate) {
        this.group.get(name).add(rate);
    }

    private boolean ratesValidation(String name) {
        return (this.group.get(name).size() >= 3 && this.group.get(name).size() <= 5);
    }

    private int[] ratesArray(String name) {
        ArrayList<Integer> rates = this.group.get(name);
        int[] outputArray = {0, 0, 0, 0, 0, 0};

        for (Integer i : rates) {
            switch (i) {
                case 3:
                    outputArray[3]++;
                    break;
                case 4:
                    outputArray[4]++;
                    break;
                case 5:
                    outputArray[5]++;
                    break;
                default:
                    outputArray[0]++;
            }
        }

        return outputArray;
    }

    private double avarageRate(String name) {
        return ((5 * ratesArray(name)[5] + 4 * ratesArray(name)[4] + 3 * ratesArray(name)[3])) / 
            (double) this.group.get(name).size();
    }

    private double awardCulc(String name) {
        if (!ratesValidation(name) || ratesArray(name)[0] > 0) {
            return -1;
        } else {
            if (ratesArray(name)[3] >= 2) {
                return 0;
            } else if (ratesArray(name)[0] == 0 && ratesArray(name)[3] == 0 && ratesArray(name)[4] == 0) {
                return AWARD * 2;
            } else if (ratesArray(name)[3] == 0 ) {
                return AWARD * 1.5;
            } else if (avarageRate(name) >= 4 && avarageRate(name) < 5) {
                return AWARD * 1.25;
            } else
                return AWARD;
        }
    }

    public void showRates() {
        Set<String> names = this.group.keySet();
        System.out.println("Group N" + number + ". Rates.");
        for (String studentsName : names) {
            System.out.println(studentsName + " - " + this.group.get(studentsName).toString());
        }
    }

    public void showAwards() {
        Set<String> names = this.group.keySet();
        System.out.println("Group N" + number + ". Awards.");
        for (String studentsName : names) {
            System.out.println(studentsName + " - " + awardCulc(studentsName));
        }
    }
}
