package Roberta.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_move_zeros {

    /*
    Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {

        int[] nums = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(move_zeros(nums)));

    }

    public static int[] move_zeros (int[] nums){

        int[]  newArray = new int [nums.length];
        int size = nums.length-1;

        for (int i = 0; i < nums.length-1; i++){

            if (nums[i] > 0){
                newArray[size] = nums[i];
                --size;
            }

        }
        return newArray;
    }


}
