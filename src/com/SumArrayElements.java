package com;

public class SumArrayElements {
    public static void main(String[] args) {
        int arr[] = {4,6,5,10,20};
        int sum=0;
        for (int i :arr)
            sum += i;

        System.out.println("The sum of array is " + sum);

    }
}
