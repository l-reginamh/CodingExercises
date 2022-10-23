package exercise027;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);

        int sum = 0, numOfDigit = 0;
        long avg = 0;

        while (true) {
            boolean isInt = input.hasNextInt();

            if (isInt) {
                int number = input.nextInt();

                sum += number;
                numOfDigit++;
            }
            else {
                if (numOfDigit > 0) {
                    avg = Math.round((double)sum / numOfDigit);
                }
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
