package Roberta.week1;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        /*
        write a method that can divide two numbers without using division operator
         */

        divideNumbers(10, 2);
        divideNumbers(0, 3);
        divideNumbers(15, 3);
        divideNumbers(10, 0);


    }

    public static void divideNumbers (int num1, int num2){  // 10, 2

        if (num2 == 0){
            System.err.println("Number cannot be divided by 0");
            System.exit(1);
        }

        int count = 0;
        String result = num1 + " divided by " + num2 + " is equal to ";

        while(num1 >= num2){
            count++;
            num1 -= num2;
        }

        System.out.println(result + count);

    }


}
