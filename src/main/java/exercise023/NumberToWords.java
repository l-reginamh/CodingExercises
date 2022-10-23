package exercise023;

public class NumberToWords {
    public static void numberToWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int digitCount = getDigitCount(number);
            int reverse = reverse(number);

            String displayString = "", word = "";
            while (digitCount > 0) {
                if (reverse == 0 && digitCount > 0) {
                    word = words[reverse];
                }
                else {
                    word = words[reverse % 10];
                    reverse /= 10;
                }

                if (displayString == "") {
                    displayString = word;
                }
                else {
                    displayString += " " + word;
                }
                digitCount--;
            }

            System.out.println(displayString);
        }
    }

    public static int reverse(int number) {
        boolean negative = false;
        if (number < 0) {
            negative = true;
            number = -number;
        }
        int reverseNumber = 0;
        while (number!= 0) {
            reverseNumber = reverseNumber * 10 + (number % 10);
            number /= 10;
        }
        return negative == true ? -reverseNumber : reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        else {
            int count = 0;
            while (number!= 0 || count <= 0) {
                count++;
                number /= 10;
            }
            return count;
        }
    }
}
