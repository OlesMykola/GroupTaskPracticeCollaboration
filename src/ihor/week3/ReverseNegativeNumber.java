package ihor.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-25));

    }

        public static String reverseNegative(int num) {
            String numAsString = String.valueOf(num);
            if (!numAsString.contains("-")){
                return "The number must be negative";
            }
            String reversed = "";
            for (int i = numAsString.length()-1; i > 0 ; i--) {
                reversed += numAsString.charAt(i);
            }

            return "-" + reversed;

        }
}