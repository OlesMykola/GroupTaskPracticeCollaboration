package Feyza.week4;

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
    }

    public static boolean sameLetters(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}
