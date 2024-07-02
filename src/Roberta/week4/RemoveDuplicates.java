package Roberta.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    /*
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> АВС
     */

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDup(str));

    }





    public static String removeDup (String str){

        LinkedHashSet<String> list = new LinkedHashSet<>(Arrays.asList(str.split("")));
        StringBuilder result = new StringBuilder();

        for (String eachLetter : list) {
            result.append(eachLetter);
        }

        String unique = result.toString();
            return unique;
    }


}
