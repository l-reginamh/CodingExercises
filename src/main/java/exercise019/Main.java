package exercise019;

public class Main {
    public static void main(String[] args) {
        /*
         * 019 - Last Digit Checker
         */
        System.out.println("Last Digit Checker");
        System.out.println("Last Digit Checker - hasSameLastDigit");
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 21, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 41));
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
        System.out.println("Last Digit Checker - isValid");
        System.out.println(LastDigitChecker.isValid(10));
        System.out.println(LastDigitChecker.isValid(468));
        System.out.println(LastDigitChecker.isValid(1051));
    }
}
