package Zina.Week1;

public class Divide_Numbers_Without_Operator {

    public static void main(String[] args) {
        // Initialize dividend, divisor, and a variable to count how many times the divisor can be subtracted from the dividend
        int dividend = 1000, divisor = 10, HowManyTimes = 0;

        // Check if divisor is zero
        if (divisor == 0) {
            // If divisor is zero, print an error message and exit the program
            System.out.println("Cannot divide by zero");
            return;
        }

        // Subtract divisor from dividend until dividend is less than divisor
        while (dividend >= divisor) {
            // Increment the count of how many times the divisor has been subtracted from the dividend
            HowManyTimes++;
            // Subtract divisor from dividend
            dividend -= divisor;
        }

        // Print the number of times the divisor can be subtracted from the dividend
        System.out.println(HowManyTimes);
    }

}
