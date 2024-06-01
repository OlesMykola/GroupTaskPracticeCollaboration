package Zina.Week1;

public class FINRA {


    public static void main(String[] args) {

        int num = 30; //initialize int num with the value 30

        boolean by3 = num % 3 == 0;
        // Check if the num is 0, then num is divisible by 3, and will be true
        boolean by5 = num % 5 == 0;
        // Check if the num is 0, then num is divisible by 5, and will be true

        if (by3 && by5) {     //Checks if num is divisible by both 3 and 5. If true, prints "FINRA"
            System.out.println("FINRA");
        } else if (by3) {     //Checks if num is only divisible by 3. If true, prints "FIN"
            System.out.println("FIN");
        } else if (by5) {     //Checks if num is only divisible by 5. If true, prints "RA".
            System.out.println("RA");
        } else {              //If num is not divisible by either 3 or 5, prints the value of num.
            System.out.println(num);

            //Since num is divisible by both 3 and 5, the output will be "FINRA"
        }
    }
}
