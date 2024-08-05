package Feyza.week7;

public class FindMinimum {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] arr = {-5, 3, 24, 0, -62};
        System.out.println(minimum(arr));
    }
    public static int minimum(int[] arr){
        int min = arr[0];
      for (int each : arr){
          if (each<min){
              min=each;
          }
      }
        return min;
    }



}
