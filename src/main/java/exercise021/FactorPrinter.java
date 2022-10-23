package exercise021;

public class FactorPrinter {
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        String displayFactors = "";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                displayFactors += String.valueOf(i) + " ";
            }
        }

        System.out.println(displayFactors);
    }
}
