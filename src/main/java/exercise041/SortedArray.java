package exercise041;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        int i = 0;
        while (i < size) {
            result[i] = scanner.nextInt();
            i++;
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
