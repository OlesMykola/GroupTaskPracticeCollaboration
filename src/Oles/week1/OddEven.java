package Oles.week1;

public class OddEven {

        public static void main(String[] args) {
            System.out.println(identify(5));
            System.out.println(identify(6));
        }

        public static String identify(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
    }
/*
Task 1
Numbers -- odd&even

Write a method which can identifies given number is even or odd

EX:
	identify(5) -> "Odd"
	identify(6) -> "Even"
 */

