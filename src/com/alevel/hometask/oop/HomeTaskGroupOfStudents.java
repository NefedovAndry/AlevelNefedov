package com.alevel.hometask.oop;

public class HomeTaskGroupOfStudents {

    public static void main(String[] args) {

        Student[] someStudents = {
                new Student("Andry", 35),
                new Student("Catty", 30),
                new ContractStudent("John", 32, 3000),
                new ContractStudent("Mike", 40, 2000)
        };

        GroupOfStudents groupN1 = new GroupOfStudents("groupN1", someStudents);

        double summOfContract = groupN1.getSummOfContract();

        System.out.println("Summ of contract in " + groupN1.getName() + " is " + summOfContract + "$");
    }

}
