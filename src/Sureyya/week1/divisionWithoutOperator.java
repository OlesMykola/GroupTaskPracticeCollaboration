package Sureyya.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        int dividend = 1000, divisor = 10 ,HowManyTimes = 0;

        if (divisor == 0){
            System.out.println("Cannot division by zero");
            return;
        }

        while (dividend >= divisor) {
            HowManyTimes++;
            dividend -= divisor;
        }
        System.out.println( HowManyTimes);
    }

}
