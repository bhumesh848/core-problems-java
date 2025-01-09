package com;

public class FindMissingNumberArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};

        int missingNumber = findMissingNumbers(arr);
        System.out.println("the missing number is "+ missingNumber);
    }

    private static int findMissingNumbers(int arr[]) {
        int n = arr.length +1;
        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;

        for (int num : arr){
            arraySum += num;

        }
        return totalSum - arraySum;
    }
}
