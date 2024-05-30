package ar_weekly_tasks.week1;

public class FINRA {
    public static void main(String[] args) {

        finra(25);
        finra(0);
        finra(6);
        finra(30);
        finra(31);

    }

    public static void finra(int numbers) {
        boolean invalidNum = numbers < 1 || numbers > 30;
        if (invalidNum) {
            System.out.println("Number out of range");
            return;

        }
        if (numbers % 3 == 0 && numbers % 5 == 0) {
            System.out.println("FINRA");
        } else if (numbers % 3 == 0) {
            System.out.println("FIN");
        } else if (numbers % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println(numbers);
        }


    }

}

