package com.cognizant.corejava;

import java.util.Scanner;

public class RecursiveFibonacci {

    static int findFibonacci(int num) {

        if (num <= 1) {
            return num;
        }

        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = findFibonacci(num);

        System.out.println("Fibonacci number is: " + result);

        sc.close();
    }
}