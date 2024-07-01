package Daria.week4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));

    }

    public static String removeDuplicates(String str) {
        Set<Character> charSet = new LinkedHashSet<>();

        for (char each : str.toCharArray()) {
            charSet.add(each);

        }
        StringBuilder result = new StringBuilder();
        for (char each : charSet) {
            result.append(each);

        }
        return result.toString();
    }
}
