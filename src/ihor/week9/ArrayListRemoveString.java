package ihor.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","John", "Eric", "Ahmed", "Karl", "John"));

        removeString(names, "Ahmed");

    }
    public static void removeString(ArrayList<String> names, String name){
        ArrayList<String> removedNames = new ArrayList<>();
        for (String each : names) {
            if (!each.equals(name)){
                removedNames.add(each);
            }
        }
        System.out.println(removedNames);
    }

}
