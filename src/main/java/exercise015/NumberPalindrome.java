package exercise015;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int numberAbs = Math.abs(number);
        int numberTemp = numberAbs;
        int reverse = 0;
        while (numberTemp!= 0) {
            reverse = (reverse * 10) + (numberTemp % 10);
            numberTemp = numberTemp / 10;
        }
        return numberAbs == reverse;
    }
}
