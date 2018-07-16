package com.alevel.hometask.oop;

public class GroupOfStudents {
    private Student[] students;
    private String name;

    GroupOfStudents(String name, Student[] students) {
        this.students = students;
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public double getSummOfContract() {
        double summ = 0;
        Student[] myGroup = students;
        for (Student student : myGroup) {
            if (student instanceof ContractStudent) {
                summ += ((ContractStudent) student).getContractCost();
            }
        }
        return summ;
    }
}
