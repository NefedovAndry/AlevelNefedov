package com.alevel.hometask.oop.petshouse;

public class PetsHouseDemo {
    public static void main(String[] args) {
        PetsHouse<Mouse> mouseHouse = new PetsHouse<>();
        mouseHouse.addPet(new Mouse("Mikkie"));
        mouseHouse.addPet(new Mouse("Kikkie"));
        mouseHouse.viewHouse();
    }
}
