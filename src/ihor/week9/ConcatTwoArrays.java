package ihor.week9;

import java.util.ArrayList;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        int[] array = {2,3,4,5};
        int[] array2 = {3,4,4,2};

        System.out.println("arrayConcat(array, array2) = " + arrayConcat(array, array2));
    }

    public static ArrayList<Integer>arrayConcat(int[] array, int[] array2){
        ArrayList<Integer> combined = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
            combined.add(array[i]);
        }
        for (int i = 0; i < array2.length ; i++) {
            combined.add(array2[i]);
        }
        return combined;
    }
}
