package com.cognizant.corejava;

class Car {

    String make;
    String model;
    int year;

    void displayDetails() {

        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2023;

        myCar.displayDetails();
    }
}