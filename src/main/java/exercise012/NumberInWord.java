package exercise012;

public class NumberInWord {
    public static void printNumberInWord(int number) {
        String[] numberString = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "OTHER"};
        if ( number < 0 || number > 9) {
            System.out.println(numberString[numberString.length-1]);
        }
        else {
            System.out.println(numberString[number]);
        }
    }
}
