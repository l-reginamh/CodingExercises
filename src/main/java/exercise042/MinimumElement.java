package exercise042;

import java.util.Scanner;

public class MinimumElement {
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int element) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[element];
        int i = 0;
        while (i < element) {
            array[i] = scanner.nextInt();
            i++;
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
