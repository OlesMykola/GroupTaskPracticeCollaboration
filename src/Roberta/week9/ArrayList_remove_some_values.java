package Roberta.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_remove_some_values {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 453, 4, 500, 6, 123));

        System.out.println(remove_values(nums));

    }

    /*
        ArrayList - Remove some values
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */


    public static ArrayList<Integer> remove_values (ArrayList<Integer> nums){

        nums.removeIf(p-> p > 100);

        return nums;
    }



}
