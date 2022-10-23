package exercise006;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int result) {
        int sum = num1 + num2;
        if (sum == result) {
            return true;
        }
        else {
            return false;
        }
    }
}
