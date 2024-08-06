package annia_reyes.week7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {50,10,20,30,1,4,66,14,9};
        FindMaximum(arr);

        int[] array = {50,10,20,30,1,4,66,14,9,104};
        FindMaximum(array);

    }

    public static void FindMaximum(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array cannot be null or it cannot be 0");
            return;
        }

        int max = arr[0]; // initializing max to the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }


}
