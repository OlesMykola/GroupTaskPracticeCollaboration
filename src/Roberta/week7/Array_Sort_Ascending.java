package Roberta.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Sort_Ascending {

    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        int[] arr2 = {46, 69, 34, 100};

        System.out.println(Arrays.toString(sorted_asc(arr)));
        System.out.println(Arrays.toString(sorted_asc(arr2)));

    }



    public static int[] sorted_asc (int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length-1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];    //saving the bigger value, so we don't lose it
                    array[j] = array[j + 1];  //swapping smaller num with a bigger num
                    array[j + 1] = temp;      // putting bigger num into smaller nums previous position (swapping)
                }
            }
        }
        return array;
    }





}
