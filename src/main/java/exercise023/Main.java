package exercise023;

public class Main {
    public static void main(String[] args) {
        /*
         * 023 - Number To Words
         */
        System.out.println("Number To Words");
        System.out.println("Number To Words - getDigitCount");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println("Number To Words - reverse");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        System.out.println("Number To Words - numberToWords");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
    }
}
