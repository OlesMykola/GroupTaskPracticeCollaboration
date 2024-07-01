package Daria.week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));

    }

    public static boolean sameLetters(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
