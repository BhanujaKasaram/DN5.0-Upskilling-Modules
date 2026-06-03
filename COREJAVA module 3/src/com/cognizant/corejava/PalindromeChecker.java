package com.cognizant.corejava;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText = reverseText + text.charAt(i);
        }

        if (text.equals(reverseText)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

        sc.close();
    }
}