package Daria_week1;

import java.util.Scanner;

public class TestCase1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println(odd(num));


    }

    public static String odd(int num) {

        return (((num & 1) == 0) ? "even" : "odd");
    }

}
  /*
  Write a method  which can identifies given number is even or odd

  EX:
   identify(5) -> "Odd
   identify(6)-> "Even"
   */