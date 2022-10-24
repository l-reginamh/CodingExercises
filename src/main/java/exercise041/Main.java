package exercise041;

public class Main {
    public static void main(String[] args) {
        int[] array = SortedArray.getIntegers(5);
        array = SortedArray.sortIntegers(array);
        SortedArray.printArray(array);
    }
}
