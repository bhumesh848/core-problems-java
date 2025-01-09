package com;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether number is positive or negative");
        int number = sc.nextInt();
        if (number >= 0){
            System.out.println("number is positive");
        }else {
            System.out.println("number is negative");
        }
    }

}
