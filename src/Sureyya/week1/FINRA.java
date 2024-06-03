package Sureyya.week1;

public class FINRA {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            boolean multiple3 = i % 3 == 0;
            boolean multiple5 = i % 5 == 0;

            if (multiple3 && multiple5) {
                System.out.println("FINRA");
            } else if (multiple3) {
                System.out.println("FIN");
            } else if (multiple5) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }


        }
    }

}
/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
