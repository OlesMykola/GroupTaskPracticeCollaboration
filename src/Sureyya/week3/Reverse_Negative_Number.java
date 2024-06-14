package Sureyya.week3;

public class Reverse_Negative_Number {

    public static void main(String[] args) {
        System.out.println(reverseNegativeInt(-203));
        System.out.println(reverseNegativeInt(-214748));

    }

    public static int reverseNegativeInt (int num) {

        int reversedNum = 0;

        while (num < 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }
        return reversedNum;
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */