package com.timbuchalka;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntArray1 = new int[5];
//        int[] myIntArray2 = {1, 3, 5, 7, 9};
//
//        for (int i=0; i<myIntArray1.length; i++) {
//            myIntArray1[i] = i*10;
//        }
//
//        for (int i=0; i<myIntArray1.length; i++) {
//            System.out.println("Element " + i  + ", value is " + myIntArray1[i]);
//        }

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;

    }
}
