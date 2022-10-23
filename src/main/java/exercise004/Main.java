package exercise004;

public class Main {
    public static void main(String[] args) {
        /*
         * 004 - Leap Year Calculator
         */
        System.out.println("Leap Year Calculator");
        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.println(LeapYearCalculator.isLeapYear(2000));
        System.out.println(LeapYearCalculator.isLeapYear(1800));
        System.out.println(LeapYearCalculator.isLeapYear(1924));
    }
}
