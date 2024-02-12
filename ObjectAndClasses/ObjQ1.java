// package DataStructuresAndAlgorithms.ObjectAndClasses;

import java.util.*;

public class ObjQ1 {
    static void getAddition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition is " + sum);
    }

    static void getMax(int a, int b) {
        if (a > b)
            System.out.println("Max is :" + a);
        else
            System.out.println("Max is :" + b);
    }

    static void getTable(int a, int b) {
        System.out.println("Table of " + a);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * a);
        }
        System.out.println("Table of " + b);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * b);
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of first number ");
        int a = scn.nextInt();
        System.out.print("Enter the value of second number ");
        int b = scn.nextInt();

        getAddition(a, b);
        getMax(a, b);
        getTable(a, b);
    }
}
