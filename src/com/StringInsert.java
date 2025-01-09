package com;

public class StringInsert {
    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println("original string + "+ original);

        String toInsert = "Beautiful ";
        int position = 6;

        StringBuilder stringBuilder = new StringBuilder(original);
        stringBuilder.insert(position,toInsert);

        String result = stringBuilder.toString();
        System.out.println("string after insertion "+ result);
    }
}
