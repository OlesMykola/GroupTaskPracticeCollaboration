package Feyza.week3;

public class ReverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        System.out.println("reverseNegativeNumber(-568) = " + reverseNegativeNumber(-568));
    }

    public static int reverseNegativeNumber(int n){

        int reversed = 0;

        while (n<0){
            int lastDigit = n % 10;
            reversed = reversed * 10 - lastDigit;
            n /= 10;
        }
        return reversed*(-1);


    }
}
