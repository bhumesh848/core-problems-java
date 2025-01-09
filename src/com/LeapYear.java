package com;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year/1000>0 ) {
            if (year % 4 == 0) {
                System.out.println(year + " is leap year");
            } else  {
                System.out.println(year + " is not leap year");
            }
        }
        else {
            System.out.println("Please enter 4 digit year");
        }
    }
}
