package exercise007;

public class Main {
    public static void main(String[] args) {
        /*
         * 007 - Teen Number Checker
         */
        System.out.println("Teen Number Checker");
        System.out.println("Teen Number Checker - hasTeen");
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println("Teen Number Checker - isTeen");
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
    }
}
