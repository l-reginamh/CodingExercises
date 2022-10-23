package exercise017;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            String numberString = String.valueOf(number);

            int sum = 0;
            for (int i = 0; i < numberString.length(); i++) {
                int tempChar = Integer.parseInt(String.valueOf(numberString.charAt(i)));
                if (tempChar % 2 == 0) {
                    sum += tempChar;
                }
            }
            return sum;
        }
        else {
            return -1;
        }
    }
}
