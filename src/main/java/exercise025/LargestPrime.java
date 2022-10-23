package exercise025;

import java.util.ArrayList;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 1) {
            return -1;
        }
        else {
            ArrayList<Integer> factors = new ArrayList<Integer>();
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    factors.add(i);
                }
            }
            int factorsCount = factors.size(), divisibleCount = 0, prime = -1;
            System.out.println("factorsCount " + factors.size());
            while (factorsCount > 0 && prime == -1) {
                divisibleCount = 0;
                for (int i = factors.get(factorsCount - 1); i > 1; i--) {
                    if (factors.get(factorsCount - 1) % i == 0) {
                        divisibleCount++;
                    }
                    if (i == 2 && divisibleCount == 1) {
                        prime = factors.get(factorsCount - 1);
                    }
                }
                if (prime == -1) {
                    factorsCount--;
                }
            }
            return prime;
        }
    }
}
