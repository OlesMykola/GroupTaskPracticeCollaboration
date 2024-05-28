package WeeklyTask.week1.Zina;

public class Odd_Even_Numbers {

        // Method to check if a number is even or odd
        public static void checkEvenOdd(int number) { //when you call this method, you need to provide
                                           // an integer argument that will be passed to the method
            if (number % 2 == 0) {   //checks if the number is even by seeing if the remainder

                System.out.println(number + " is even."); // when divided by 2 is 0.
            } else {   //otherwise  the number is odd
                System.out.println(number + " is odd.");
            }
        }

        public static void main(String[] args) {
            //Here we test the method with a few examples
            checkEvenOdd(13); // Output: 10 is even.
            checkEvenOdd(8);  // Output: 7 is odd.
            checkEvenOdd(0);  // Output: 0 is even.
            checkEvenOdd(-9); // Output: -3 is odd.
        }
    }


