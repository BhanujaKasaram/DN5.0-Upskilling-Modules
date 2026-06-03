package com.cognizant.corejava;

public class TypeCastingExample {

    public static void main(String[] args) {

        double num1 = 25.75;
        int result1 = (int) num1;

        int num2 = 50;
        double result2 = (double) num2;

        System.out.println("Double to Int: " + result1);
        System.out.println("Int to Double: " + result2);
    }
}