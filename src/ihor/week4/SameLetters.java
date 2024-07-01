package ihor.week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        String str1 = "aairo";
        String str2 = "oraia";
        System.out.println(result(str1, str2));
    }

        public static boolean result(String str1, String str2){
            char[] first = str1.toCharArray();
            char[] second = str2.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            return Arrays.equals(first, second);

            }
        }

