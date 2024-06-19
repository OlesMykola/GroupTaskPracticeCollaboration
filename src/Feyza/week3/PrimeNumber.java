package Feyza.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        //Write a method that can check if a number is prime or not

        System.out.println("isPrime(47) = " + isPrime(45));

    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }

        }
        return true;
    }
}
