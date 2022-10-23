package exercise018;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            String num1String = String.valueOf(num1);
            String num2String = String.valueOf(num2);

            boolean found = false;
            for (int row = 0; row < num1String.length(); row++) {
                for (int col = 0; col < num2String.length(); col++) {
                    if (num1String.charAt(row) == num2String.charAt(col)) {
                        found = true;
                    }
                    if (found == true) {
                        break;
                    }
                }
                if (found == true) {
                    break;
                }
            }

            return found;
        }
        else {
            return false;
        }
    }
}
