package com;

// Widening casting(Automatic casting)
public class TypeCasting {
//    public static void main(String[] args) {
//        int myInt = 9;
//        double myDouble = myInt;
//
//        System.out.println(myInt);
//        System.out.println(myDouble);
//    }

    // Narrowing Casting(Manual casting)
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
