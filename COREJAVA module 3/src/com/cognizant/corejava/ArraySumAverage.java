package com.cognizant.corejava;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            sum = sum + arr[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}