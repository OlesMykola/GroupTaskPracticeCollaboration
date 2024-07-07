package Roberta.week4;

public class FrequencyOfCharacters {

    /*
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") => A3B2C1D2
     */

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String str2 = "MMKKAAHH";
        System.out.println(frequencyOfChars(str));
        System.out.println(frequencyOfChars(str2));


    }


    public static String frequencyOfChars (String str) {
        String result = "";

        for (int i = 0; i < str.length()-1; i++) {
            int count=0;

            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(i)==(str.charAt(j))){
                    count++;
                }

            }

            if (result.contains( str.charAt(i)+ "" )){
                continue;
            }
            result += str.charAt(i);
            result += count;

        }
        return result;
    }






    
}
