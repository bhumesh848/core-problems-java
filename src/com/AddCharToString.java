package com;


public class AddCharToString {
    public static void main(String[] args) {

        String original = "Hello";

        char toAdd = '!';
        StringBuilder stringBuilder = new StringBuilder(original);
        stringBuilder.append(toAdd);

        String result = stringBuilder.toString();
        System.out.println("Original String: " + original);
        System.out.println("String after adding character: " + result);
    }
}
