package exercise016;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int tempNumber = number, tempStore;
            int start = 0, end = tempNumber % 10;

            while (tempNumber!=0) {
                tempStore = tempNumber % 10;
                tempNumber /= 10;
                if (tempNumber == 0) {
                    start = tempStore;
                }
            }

            return start + end;
        }
        else {
            return -1;
        }
    }
}
