package com;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is palindrome or not:");
        int enteredNumber = sc.nextInt();

        System.out.println("Entered number is: " + enteredNumber);

        int originalNumber = enteredNumber;
        int reverseNumber = 0;

        while (enteredNumber > 0) {
            int remainder = enteredNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            enteredNumber = enteredNumber / 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        sc.close();
    }
}
