package exercise010;

public class Main {
    public static void main(String[] args) {
        /*
         * 010 - EqualityPrinter
         */
        System.out.println("Equality Printer");
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
    }
}
