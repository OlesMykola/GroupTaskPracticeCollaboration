package Feyza.week2;

public class SwapNumbers {

    //Swap two variable values without using a third variable

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 7;

        num2 = num2 - num1; //num2 = 4
        num1 = num1 + num2; //num1 = 7
        num2 = num1 - num2; //num2 = 3

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
