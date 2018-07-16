//package com.alevel.hometask.oop;

public class HometaskDelivery {

    public static void main(String[] args) {
    	City checkOut = City.Kharkov;
    	City checkIn = City.Chernigov;
    	Transport transport = Transport.Plane;
    	Baggage packageN1 = new Baggage("packN1", 3, 990);
    	
    	Delivery deliveryN1 = new Delivery(packageN1, transport, checkOut, checkIn);
    	deliveryN1.info();
    }

}