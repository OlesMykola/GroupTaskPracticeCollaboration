package ihor.week3;

public class PrimeNumber { //Work in progress!!!
    public static void main(String[] args) {

        System.out.println("isPrime(3) = " + isPrime(3));
    }

    public static boolean isPrime (int num){
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
