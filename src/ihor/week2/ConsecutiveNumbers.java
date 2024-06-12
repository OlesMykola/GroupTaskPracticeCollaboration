package ihor.week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

        numbers(40);

    }

    public static void numbers(int num) {
        if (num <= 0) {
            System.out.println("Number can not be negative or zero");
        }
        for (int i = 1; i < num; i++) {

            if ((i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("CodilityTestCoders");
            } else if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("CodilityTest");
            } else if ((i % 2 == 0) && (i % 5 == 0)) {
                System.out.println("CodilityCoders");
            } else if (i % 2 == 0){
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);

            }
        }
    }
}
