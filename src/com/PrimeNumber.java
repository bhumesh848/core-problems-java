package com;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i,m=0,flag=0;

        System.out.println("Enter a number to check whether prime or not ");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();
        m=enteredNumber/2;
        if (enteredNumber == 0 || enteredNumber == 1){
            System.out.println("Entered Number is not a prime number");
        }else{
            for(i=2;i<=m;i++){
                if(enteredNumber %i == 0){
                    System.out.println(enteredNumber+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(enteredNumber+" is prime number"); }
        }

    }
}
