package Roberta.week7;

import java.util.Arrays;

public class Array_Sort_Descending {

    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90};
        int[] arr2 = {28, 100, 58, 45};

        System.out.println(Arrays.toString(sorted_desc(arr)));
        System.out.println(Arrays.toString(sorted_desc(arr2)));

    }


    public static int[] sorted_desc (int[] array) {

        for (int i = array.length-1; i > 0; i--) {

            for (int j = array.length-1; j > 0; j--) {

                if (array[j] > array[j-1]){
                    int temp = array[j];        // saving bigger num, not to loose it's value
                    array[j] = array[j - 1];   // swapping bigger num with a smaller num
                    array[j - 1] = temp;        // placing the bigger temp num into previous smaller num place
                }
            }

        }

        return array;
    }

}
