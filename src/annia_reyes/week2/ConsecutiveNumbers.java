package annia_reyes.week2;

//Numbers -- print consecutive numbers
//Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

public class ConsecutiveNumbers {
    public static void main(String[] args) {

        int numbers = 60;
        String by2 = "Codility";
        String by3 = "Test";
        String by5 = "Coders";


        for (int i = 1; i <= numbers; i++) {
            boolean isBy2 = i % 2 == 0;
            boolean isBy3 = i % 3 == 0;
            boolean isBy5 = i % 5 == 0;

            if (isBy2 || isBy3 || isBy5) {

                String output = "";

                if (isBy2) {
                    output += by2;
                }
                if (isBy3) {
                    output += by3;
                }
                if (isBy5) {
                    output += by5;
                }
                System.out.println(output);
            } else {
                System.out.println(i);
            }


        }


    }
}
