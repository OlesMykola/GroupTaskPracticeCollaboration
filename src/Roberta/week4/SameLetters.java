package Roberta.week4;

public class SameLetters {

    /*
    Write a return method that check if a string is build out of the same letters as another string.
    Ex: same("abc", "cab"); - true
        same("abc", "abb"); -> false:
     */

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("mama", "amam"));
        System.out.println(sameLetters("cat", "dog"));

    }


    public static boolean sameLetters (String str, String str2){

        boolean result = false;

        for (int i = 0; i < str.length()-1; i++) {       //ABC

            for (int j = 0; j < str2.length()-1; j++) {     //CBA
                if (str.charAt(i) == (str2.charAt(j))) {
                    result = true;
                }


            }

        }

        return result;      // if any of the letters do not match, it will exit the loop and return default result #22
    }

}
