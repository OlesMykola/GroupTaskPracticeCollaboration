package Roberta.week1;

public class OddEven {

    public static void main(String[] args) {

        /* write a method which can identify if given number is even or odd

        ex:
        identify(5) -> "Odd"
        identify(6) -> "Even"

         */

        odd_or_even(-4);

    }


    public static void odd_or_even(int number){

        if(number==0){
            System.err.println("Number is not divisible");
        } else if (number%2==0) {
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
        }

    }



}
