package ihor.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
            int[] array = {2,0,4,5,0,1,0};

        System.out.println("sorted() = " + sorted(array));
    }

    public static String sorted(int[] array){

        ArrayList<Integer> sort = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                sort.add(array[i]);
            }
            if (array[i]!=0) {
                sort.add(0, array[i]);
            }
        }
        return sort.toString();
        }

    }

