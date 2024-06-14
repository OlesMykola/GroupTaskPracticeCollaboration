package ihor.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 7;
        int y = 2;

        x = x + y;  //9
        y = x - y;  //7
        x = x - y;  //2

        System.out.println("x = " + x +" y = " + y);
    }
}
