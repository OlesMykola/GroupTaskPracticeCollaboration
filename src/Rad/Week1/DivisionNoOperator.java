package Rad.Week1;

public class DivisionNoOperator {
    public static void main(String[] args) {

     int dividend = 10;
     int divisor = 2;
     int quotient = 0;

     while (dividend >= divisor){
         dividend -= divisor;
         quotient++;
     }

        System.out.println("quotient:" + quotient);
    }


}
