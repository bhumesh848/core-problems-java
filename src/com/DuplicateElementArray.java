package com;

public class DuplicateElementArray {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 6, 3, 2, 8, 6,8,1,12};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
