package annia_reyes.week7;

/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */

import java.util.Arrays;

public class Array_SortAscending {

    public static void main(String[] args) {

        int[] array = {3,4,1,3,8,6,-1,5,1,2,6};
        int[] array2 = {-50,-20,30,-55,1,5,16,164,20,5,94};
        System.out.println(Arrays.toString(SortAscending(array)));
        System.out.println(Arrays.toString(SortAscending(array2)));
    }
    public static int[] SortAscending(int[] array){

        if (array == null || array.length == 0){
            System.out.println("Array cannot be null or 0");
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
             //   System.out.println(Arrays.toString(array));
            }
        }
        return array;
    }


}

