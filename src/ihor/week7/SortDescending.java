package ihor.week7;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] numbers = {20, 3, 45, 457, 5686, 43, 3, 2, 357, 8, 2};

        System.out.println(Arrays.toString(sortedDescending(numbers)));


    }

    public static int[] sortedDescending(int[] array) {

        if (array == null || array.length == 0) {
            System.err.println("Array cannot be null or empty");
        }

        boolean swapped = true;
        int j = 0;
        int temp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }
}

