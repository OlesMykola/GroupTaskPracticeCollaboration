package Roberta.week5;

public class String_Reverse {

    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String name = "David";

        System.out.println(reverse_string(name));
        System.out.println(reverse_string2(name));


    }

    public static String reverse_string (String word) {

        String reversedString = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }
        return reversedString;
    }




    //Solution with StringBuilder
    public static String reverse_string2 (String word) {

         StringBuilder reversedString = new StringBuilder();

        for (int i = word.length()-1; i >= 0; i--) {
              reversedString.append(word.charAt(i));
        }

         return reversedString.toString();
    }


}
