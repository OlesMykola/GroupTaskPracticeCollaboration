package annia_reyes.week2;
//Numbers -- Swap Numbers
//Swap two variable values without using a third variable

public class SwapNumbers {

    public static void main(String[] args) {

        int number1 = 25;
        int number2 = 15;
        System.out.println("Before swapping number1: " + number1);
        System.out.println("Before swapping number2: " + number2);

        number2 = number2 + number1;// 15 + 25 = 40
        number1 = number2 - number1;// 40 - 25 = 15
        number2 = number2 - number1;// 40 - 15 = 25

        System.out.println("After swapping number1: " + number1);
        System.out.println("After swapping number2: " + number2);



    }
}
