package Roberta.week6;

import java.util.Arrays;

public class Array_FindMaximum {

    /*
    Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static void main(String[] args) {

        int[] nums = {1, 5, 7, 3, 8};
        int[] nums2 = {10, 30, 60, 3, 50};

        System.out.println("max_num = " + max_num(nums));
        System.out.println("max_num = " + max_num(nums2));


    }


    public static int max_num (int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

}
