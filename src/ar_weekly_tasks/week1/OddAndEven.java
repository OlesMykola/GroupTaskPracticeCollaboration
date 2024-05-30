package ar_weekly_tasks.week1;

public class OddAndEven {
    public static void main(String[] args) {

        OddOrEven(6);
        OddOrEven(7);


    }

    public static void OddOrEven(int number){
        if (number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
