package Sureyya.week4;

public class SameLetters {
    public static boolean same(String str1, String str2) {
        if (str1.length() != str2.length()) {
        return false;
    }

    int[] letters = new int[256]; // Assuming ASCII character set

        for (int i = 0; i < str1.length(); i++) {
        letters[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
        letters[str2.charAt(i)]--;
        }

        for (int count : letters) {
            if (count != 0) {
                return false;
            }
        }

        return true;
}

    public static void main(String[] args) {
        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false
    }
}
/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */