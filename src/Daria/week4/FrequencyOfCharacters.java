package Daria.week4;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        // System.out.println(frequencyOfChars("ABCDVFDD&*//DBCF98"));
        System.out.println(frequencyOfChars("AAABBCDD"));


    }

    public static String frequencyOfChars(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        String newChars = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);

            charCountMap.put(eachLetter, charCountMap.getOrDefault(eachLetter, 0) + 1);

        }
        for (Character i : charCountMap.keySet()) {
            // newChars += "key: " + i + " value: " + charCountMap.get(i) + "\n";
            newChars += i + "" + charCountMap.get(i);
        }


        return newChars;
    }

}
