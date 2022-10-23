package exercise014;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0) {
            return number % 2 == 1;
        }
        else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for(int i = start; i <= end; i++) {
                sum += isOdd(i) ? i : 0;
            }
            return sum;
        }
        else {
            return -1;
        }
    }
}
