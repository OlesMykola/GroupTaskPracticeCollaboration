package annia_reyes.week3;
//String -- Same letters
//Write a return method that check if a string is build out of the
//same letters as another string.
//Ex: same("abc", "cab"); -> true
//same("abc", "abb"); -> false:

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(same("abc", "bac"));
        System.out.println(same("abc", "bbc"));
        System.out.println(same("acc", "bac"));

        System.out.println(same2("abc" , "dcsss"));
        System.out.println(same2("dcsss" , "dcsss"));
        System.out.println(same2("abc" , "cba"));

    }

    public static boolean same(String word1, String word2) {

        if (word1.length() != word2.length()){
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            char charToCheck = word1.charAt(i);

            int count1 = 0;
            for (int j = 0; j < word1.length(); j++) {
                char word1Char = word1.charAt(j);

                if (word1Char == charToCheck) {
                    count1++;
                }
            }

            int count2 = 0;
            for (int j = 0; j < word2.length(); j++) {
                char word2Char = word2.charAt(j);

                if (word2Char == charToCheck) {
                    count2++;
                }
            }
            if (count1 != count2) {
                return false;
            }

        }
        return true;
    }

    public static boolean same2(String word1, String word2){

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        return Arrays.equals(word1Array, word2Array);
    }
}
