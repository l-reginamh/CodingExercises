package exercise005;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Formatted = (int)(num1 * 1000);
        int num2Formatted = (int)(num2 * 1000);

        if (num1Formatted == num2Formatted) {
            return true;
        }
        else {
            return false;
        }
    }
}
