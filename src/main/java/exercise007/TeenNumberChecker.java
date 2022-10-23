package exercise007;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean num1HasTeen = num1 >= 13 && num1 <= 19;
        boolean num2HasTeen = num2 >= 13 && num2 <= 19;
        boolean num3HasTeen = num3 >= 13 && num3 <= 19;

        return num1HasTeen || num2HasTeen || num3HasTeen;
    }

    public static boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }
}
