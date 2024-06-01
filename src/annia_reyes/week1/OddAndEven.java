package annia_reyes.week1;

public class OddAndEven {
    public static void main(String[] args) {

        OddOrEven(6);
        OddOrEven(7);
        OddOrEven(13);


    }

    public static void OddOrEven(int number){
        if (number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
