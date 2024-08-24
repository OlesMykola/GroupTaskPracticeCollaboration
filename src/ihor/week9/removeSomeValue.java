package ihor.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class removeSomeValue {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,2,343,64,2342,23,354,34,100));


        removeNumber(list, 100);
    }


    public static void removeNumber(ArrayList<Integer> list, int num) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int each : list) {
            if (each <= num) {
                newList.add(each);
            }
        }
        System.out.println(newList);
    }

}
