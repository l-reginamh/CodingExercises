package exercise019;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if ((n1 >= 10 && n1 <= 1000) && (n2 >= 10 && n2 <= 1000) && (n3 >= 10 && n3 <= 1000)) {
            int n1LastDigit = n1 % 10, n2LastDigit = n2 % 10, n3LastDigit = n3 % 10;
            int sameCount = 0;

            if (n1LastDigit == n2LastDigit || n1LastDigit == n3LastDigit || n2LastDigit == n3LastDigit) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }
}
