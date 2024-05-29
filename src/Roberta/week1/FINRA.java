package Roberta.week1;

public class FINRA {

    /*
    Write a method which prints out the numbers from 1 to 30 but for numbers which
    are a multiple of 3print "FIN" instead of the number and for numbers which are a
    multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
    both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {

        finra(1, 30);

    }

    public static void finra (int num1, int num2) {     // 1, 30


        while (num1 <= num2){

            if ( num1 % 3 == 0 && num1 % 5 ==0){
                System.out.print(" FINRA ");
            } else if (num1 % 3 == 0) {
                System.out.print(" FIN ");
            } else if (num1 % 5 == 0) {
                System.out.print(" RA ");
            }else {
                System.out.print(num1+" ");
            }

            num1++;

        }

    }


}

