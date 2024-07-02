package Sureyya.week4;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str)); // Output: ABC
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */