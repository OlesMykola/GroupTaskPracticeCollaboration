package Roberta.week3;

public class PrimeNumber {

    // write a method that can check if a number is prime or not
    // prime number - a whole number greater than 1 that cannot be exactly divided by any whole number
    // other than itself and 1 (e.g. 2, 3, 5, 7, 11)

    public static boolean isPrime(int num) {      // 10

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {

        System.out.println("isPrime(2) = " + isPrime(2));
        System.out.println("isPrime(3) = " + isPrime(3));
        System.out.println("isPrime(10) = " + isPrime(10));
        System.out.println("isPrime(15) = " + isPrime(15));


    }


}