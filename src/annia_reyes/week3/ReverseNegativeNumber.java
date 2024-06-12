package annia_reyes.week3;

public class ReverseNegativeNumber {
    //2️⃣ Numbers -- Reverse Negative Number
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        System.out.println(reverseDigits(12345));
        System.out.println(reverseDigits(45));
        System.out.println(reverseDigits(89));
        System.out.println(reverseDigits(89896582));
    }


    // I had to search for this one. I really don't get it much

    public static int reverseDigits(int number) {

        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;

    }
}
