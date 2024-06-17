package Daria.week3;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Type negative number:");
        int number = scan.nextInt();
        System.out.println(reverseNegativeNumber(number));


    }

    public static int reverseNegativeNumber(int num) {
        if (num >= 0) {
            System.out.println("Number must be negative");

        }
        int reversed = 0;
        num = Math.abs(num); // abs returns absolute positive value of a number
        while (num != 0) {
            int digits = num % 10;
            reversed = reversed * 10 + digits;
            num /= 10;
        }
        return -reversed;
    }
}
