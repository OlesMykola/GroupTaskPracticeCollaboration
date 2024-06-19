package Daria.week3;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number please:");
        int num = scan.nextInt();
        primeNumbersRange(num);

    }

    public static void primeNumbersRange(int number) {
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                System.out.println(i);
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }

}
