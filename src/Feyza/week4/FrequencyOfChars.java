package Feyza.week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */
public class FrequencyOfChars {


    public static void main(String[] args) {
        frequency("AAABBCDD");
    }
    public static void frequency(String str){
        Map<Character, Integer> counter = new HashMap<>();

        for (int i =0; i<str.length(); i++){
            char eachChar = str.charAt(i);

            if (!counter.containsKey(eachChar)){
                counter.put(eachChar, 0);
            }

            counter.put(eachChar, counter.get(eachChar) +1);
        }

        System.out.println(counter);

    }





}
