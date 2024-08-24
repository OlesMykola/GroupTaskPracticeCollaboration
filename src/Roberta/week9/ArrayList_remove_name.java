package Roberta.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_remove_name {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(remove_name(names));

    }

    /*
        ArrayList - Remove "Ahmed"
        Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
     */


    public static ArrayList<String> remove_name (ArrayList<String> names){

        names.removeIf(p-> p.contains("Ahmed"));

        return names;
    }



}
