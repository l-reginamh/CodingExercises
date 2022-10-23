package exercise004;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            boolean divisibleBy4 = (year % 4 == 0);
            boolean divisibleBy100 = (year % 100 == 0);
            boolean divisibleBy400 = (year % 400 == 0);

            if (divisibleBy4) {
                if (divisibleBy100) {
                    if (divisibleBy400) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
