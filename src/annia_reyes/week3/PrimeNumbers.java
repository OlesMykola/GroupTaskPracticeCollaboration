package annia_reyes.week3;

public class PrimeNumbers {

    //1️⃣ Numbers -- PrimeNumber
    //Write a method that can check if a number is prime or not

    public static void main(String[] args) {


        // if number is divisible by 1 and by the number itself isPrime is true: (they must have two positive divisors). Will start from 2 becuase 0 and 1 are not prime numbers


        System.out.println(isPrime(60));
        System.out.println(isPrime(13));
    }

    public static boolean isPrime(int number){
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;

            }

        }
        return true;

    }
}
