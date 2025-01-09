package com;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2");
        int number2 = sc.nextInt();
        System.out.println("Value before swap : number1 = " + number1 + "; number2 = " + number2);
        int tmp=number1;
        number1=number2;
        number2=tmp;
        System.out.println("Value after  swap : number1 = " + number1 + "; number2 = " + number2);
    }
}
