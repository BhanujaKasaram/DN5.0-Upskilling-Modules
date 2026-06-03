package com.cognizant.corejava;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText = reverseText + text.charAt(i);
        }

        System.out.println("Reversed String: " + reverseText);

        sc.close();
    }
}