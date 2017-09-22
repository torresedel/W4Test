package com.example.admin.w4test;

/**
 * Created by Admin on 9/22/2017.
 */

//2. Sort the array with multiple same values in the array in an ascending order.
//        Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
//        Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
//        -Also find the highest number in the array (do not use any collections method)


public class ArraySort {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sortMyArray(array);
    }

    public static void sortMyArray(int[] array) {

        int []sortedArray = array;
        int tempValue = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if(array[i] < sortedArray [j]) {
                    tempValue = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = tempValue;
                }
            }
            tempValue = sortedArray[i];
        }
        array = sortedArray;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.print("\n Highest number" + Integer.toString(tempValue));
    }

}
