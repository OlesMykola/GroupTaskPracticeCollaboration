package Sureyya.week3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(1));

    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
/*
Write a method that can check if a number is prime or not
prime number is only divisible by 1 and itself
 */
