package Daria.week1;

public class DivisionWithOperator {
    public static void main(String[] args) {

        System.out.println(divideTwoNumbers(181, 6));

    }

    public static String divideTwoNumbers(int num1, int num2) {

        return ((int) Math.pow(Math.E, (Math.log(num1) - Math.log(num2)))) + " with a reminder of " + (num1 % num2);
    }
}


