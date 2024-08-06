package annia_reyes.week7;

import java.util.Arrays;

/*
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
public class Array_SortDescending {

    public static void main(String[] args) {
        int[] array = {3,4,1,3,8,6,-1,5,1,2,6};
        int[] array2 = {-50,-20,30,-55,1,5,16,164,20,5,94};
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(SortDescending(array)));
        System.out.println(Arrays.toString(SortDescending(array2)));
        System.out.println(Arrays.toString(SortDescending(arr)));

    }
    public static int[] SortDescending(int[] array){

        if (array ==null || array.length == 0){
            System.out.println("Array cannot be null or 0");
            return array;
        }

        for (int i = 0; i < array.length; i++) { //10,20,7, 8, 90
            for (int i1 = 0; i1 < array.length - 1; i1++) {
                if ( array[i1 + 1] > array[i1]){
                    int temp = array[i1 + 1];
                    array[i1 + 1] = array[i1];
                    array[i1] = temp;

                }
             //   System.out.println(Arrays.toString(array));
            }
        }



        return array;

    }
}
