package annia_reyes.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        int dividend = 13;
        int divisor = 2;

        System.out.println(division(dividend, divisor));

        dividend = -13;
        divisor = 2;

        System.out.println(division(dividend, divisor));

        dividend = 13;
        divisor = -2;

        System.out.println(division(dividend, divisor));





    }

    // Division without the '/' it is done with repeated subtraction and incrementing the quotient
    public static int division(int dividend, int divisor){
        if(divisor == 0 ){
            throw new ArithmeticException("Division by zero");

        }

        boolean negativeResult = false;
       if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0){
           negativeResult = true;
       }


       if (dividend < 0){
           dividend = - dividend;
       }
       if(divisor < 0 ){
           divisor = - divisor;
       }

        int quotient = 0;
        while (dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }
        return negativeResult? -quotient : quotient;
    }

}
