package Roberta.week9;

import java.util.Arrays;

public class Array_concat_two_arrays {

    public static void main(String[] args) {

        String[] arr1 = {"It's", "a", "beautiful", "day"};
        String[] arr2 = {"sun", "is", "shinning"};

        System.out.println(Arrays.toString(concat2Arrays(arr1, arr2)));


    }

    /*
        Array - Concat two arrays
        Write a return method that can concate two arrays
     */

    public static String[] concat2Arrays (String[] array1, String[] array2){

        String[] newArray = Arrays.copyOf(array1, array1.length + array2.length);
        int j = 0;

        for (int i = array1.length; i < newArray.length; i++) {
            newArray[i] = array2[j];
            ++j;
        }

        return newArray;
    }


}
