package Baver.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        result(10,5);

    }

    public static void result(int num1, int num2){
        if(num2 == 0){
            System.err.println("Can not divide by 0");
        }
        else {
            int count = 0;
            while(num1 >= num2){
                num1 -= num2;
                count++;
            }
            System.out.println("Result:" + count);
        }

    }
}
