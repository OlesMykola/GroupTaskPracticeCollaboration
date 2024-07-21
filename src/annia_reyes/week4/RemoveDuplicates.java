package annia_reyes.week4;

import java.util.LinkedHashSet;
import java.util.Set;

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println("removeDup(\"AAABBBCCC\") = " + removeDup("AAABBBCCC"));
        System.out.println("removeDup2(\"ANNIAGUZMAN\") = " + removeDup2("ANNIAGUZMAN"));
        System.out.println("removeDup3(\"SSIPPA\") = " + removeDup3("SSIPPA"));

    }

    public static String removeDup(String str) {

        Set<Character> characterLinkedHashSet = new LinkedHashSet<>();

        for (char each : str.toCharArray()) {
            characterLinkedHashSet.add(each);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : characterLinkedHashSet) {
            result.append(ch);
        }

        return result.toString();
    }

    public static String removeDup2(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < newString.length(); j++) {
                if (newString.charAt(j) == currentCharacter) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newString.append(currentCharacter);
            }
        }
        return newString.toString();
    }


    public static String removeDup3(String str) {

        StringBuilder newString = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char currentCharacter = str.charAt(i);
            boolean isDuplicate = false;

            int j = 0;
            while (j < newString.length()) {
                if (newString.charAt(j) == currentCharacter) {
                    isDuplicate = true;
                    break;
                }
                j++;
            }
            if (!isDuplicate) {
                newString.append(currentCharacter);
            }
            i++;
        }
        return newString.toString();
    }
}
