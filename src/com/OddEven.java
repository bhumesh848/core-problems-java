package com;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether number is even or odd ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("The Entered Number "+ number + " is a Even Number");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
