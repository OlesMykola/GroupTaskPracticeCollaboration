package annia_reyes.week4;

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result = frequencyOfChars(str);
        System.out.println(result); // Output: A3B2C1D2
    }

    public static String frequencyOfChars(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String result = "";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            int count = 1;

            // Count the frequency of the current character
            while (i + 1 < length && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // Append the character and its count to the result
            result += currentChar + String.valueOf(count);
        }

        return result;
    }
}

