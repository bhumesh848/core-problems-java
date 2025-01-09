package com;


import java.util.Scanner;

public class IterateOverChar {
    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Characters in the string:");

        // Iterate over each character using a for loop
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            System.out.println(currentChar);
        }

        // Close the scanner
        scanner.close();
    }
}
