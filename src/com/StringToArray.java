package com;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        // Input string
        String input = "Java is fun to learn";

        // Convert the string into a string array using split()
        String[] stringArray = input.split(" ");

        // Print the resulting array
        System.out.println("Original String: " + input);
        System.out.println("String Array: " + Arrays.toString(stringArray));
    }
}
