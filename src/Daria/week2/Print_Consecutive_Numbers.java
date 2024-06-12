package Daria.week2;



 /*
       Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
       each on a separate line.

       However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
       If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation
       of the respective words Codility, Test and Coders in this given order.

       For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest
       and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders
*/

import java.util.Scanner;

public class Print_Consecutive_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Print a number: ");
        int number = scan.nextInt();
        consecutiveNumbers(number);


    }

    public static void consecutiveNumbers(int num) {


        for (int i = 1; i <= num; i++) {
            String str = "";

            if (i % 2 == 0) {

                str += "Codility";

            }
            if (i % 3 == 0) {
                str += "Test";

            }
            if (i % 5 == 0) {
                str += "Coders";

            }
            if (str.isEmpty()) {
                str += i;
            }
            System.out.println(str);
        }

    }
}

