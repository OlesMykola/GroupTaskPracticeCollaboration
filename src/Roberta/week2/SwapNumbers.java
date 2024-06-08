package Roberta.week2;

public class SwapNumbers {

    public static void main(String[] args) {

        /*
        Swap two variable values without using a third variable
         */

        int num1 = 2;
        int num2 = 10;

        num2 = num2-num1;   //8
        num1 = num1+num2;   //10
        num2 = num1-num2;   //2

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
