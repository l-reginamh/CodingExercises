package exercise020;

import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            ArrayList<Integer> firstDivider = new ArrayList<Integer>();
            ArrayList<Integer> secondDivider = new ArrayList<Integer>();

            for (int i = 1; i <= first; i++) {
                if (first % i == 0) {
                    firstDivider.add(i);
                }
            }

            for (int i = 1; i <= second; i++) {
                if (second % i == 0) {
                    secondDivider.add(i);
                }
            }

            int highestDivider = 0;
            boolean highestDividerFound = false;
            for (int i = firstDivider.size()-1; i >= 0; i--) {
                for (int j = secondDivider.size()-1; j >= 0; j--) {
                    if (firstDivider.get(i) == secondDivider.get(j)) {
                        highestDivider = firstDivider.get(i);
                        highestDividerFound = true;
                        break;
                    }
                }
                if (highestDividerFound == true && highestDivider != 0) {
                    break;
                }
            }
            return highestDivider;
        }
        else {
            return -1;
        }
    }
}
