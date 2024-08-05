package Roberta.week7;

import java.util.Arrays;

public class Array_Find_Minimum {

    /*
    Question1: Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */

        public static void main(String[] args) {

                int[] nums = {1, 5, 7, 3, 8};
                int[] nums2 = {10, 30, 60, 3, 50};

                System.out.println("min_number = " + min_number(nums));
                System.out.println("min_number = " + min_number(nums2));

                System.out.println("max_num = " + max_num(nums));
                System.out.println("max_num = " + max_num(nums2));

        }


        public static int min_number (int[] numbers){
                Arrays.sort(numbers);
                return numbers[0];
        }


        public static int max_num (int[] numbers){
                Arrays.sort(numbers);
                return numbers[numbers.length-1];
        }



}
