package com;

import java.util.Scanner;

public class MatrixArrayAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix1 = new int[3][3];
        int [][] matrix2 = new int[3][3];
        int  [][] sumMatrix = new int[3][3];

        System.out.println("enter elemts of the first matrix");
        for (int i =0;i< 3;i++){
            for (int j =0;j<3;j++){
                System.out.println("Enter i " + i +" j "+ j);
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elemts of the second matrix");
        for (int i =0;i< 3;i++){
            for (int j =0;j<3;j++){
                System.out.println("Enter i " + i +" j "+ j);
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i =0;i<3;i++){
            for (int j= 0;j<3;j++){
                System.out.println(sumMatrix[i][j] + "");
            }
        }

        System.out.print(" ");


    }
}
