package com;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int arr1[] = {
                1998,1997,2003,2001,2006,2002,2004,2008,2009,2007,
        };

        String strArray[] = {
                "java","python","C","C++","Javascript",
        };

        System.out.println("original numeric array = " + Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("Sorted Numeric array = " + Arrays.toString(arr1));

        System.out.println("original Aplhabetic array = " + Arrays.toString(strArray));

        Arrays.sort(strArray);
        System.out.println("Sorted Alphabetic array = " + Arrays.toString(strArray));



                Scanner sc = new Scanner(System.in);

                int[] ages = new int[10];

                System.out.println("Enter the age of 10 students:");

                for (int i = 0; i < ages.length; i++) {
                    System.out.print("Enter age for student " + (i + 1) + ": ");
                    ages[i] = sc.nextInt();
                }

                System.out.println("\nVoting Eligibility Results:");

                for (int i = 0; i < ages.length; i++) {
                    if (ages[i] < 0) {
                        System.out.println("Invalid age: " + ages[i]);
                    } else if (ages[i] >= 18) {
                        System.out.println("The student with the age " + ages[i] + " can vote.");
                    } else {
                        System.out.println("The student with the age " + ages[i] + " cannot vote.");
                    }
                }
            }
        }


