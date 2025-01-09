package com;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet ");
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)){
            System.out.println(ch + " is a Alphabet");
        } else if (!Character.isAlphabetic(ch)) {
            System.out.println("Enter valid Alphabet");
        }

    }
}
