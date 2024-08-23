package ihor.week7;

import java.util.ArrayList;

public class ArrayFindMinimum {
    public static void main(String[] args) {

        int[] numbers = {20,3,45,457,5686,43,3,2,357,8,2};
        System.out.println("minimum(numbers) = " + minimum(numbers));

    }

    public static int minimum(int[] array){


        if (array == null || array.length == 0) {
            System.err.println("Array cannot be null or empty");
        }

        int min = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}

