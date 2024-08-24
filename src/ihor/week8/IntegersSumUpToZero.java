package ihor.week8;

import java.util.Arrays;

public class IntegersSumUpToZero {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution2(5)));
    }



    public static long[] solution2(int N) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[N - 1] = -sum;
        System.out.println(Arrays.toString(result));
        return new long[0];
    }

    public static int[] solution(int N) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;//0+1+2+3....
        }
        System.out.println(Arrays.toString(result));
        System.out.println(sum);
        result[N - 1] = -sum;
        return result;
    }
}
