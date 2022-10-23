package exercise013;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            boolean divisibleBy4 = (year % 4 == 0);
            boolean divisibleBy100 = (year % 100 == 0);
            boolean divisibleBy400 = (year % 400 == 0);

            return (divisibleBy4 && !divisibleBy100) || divisibleBy400;
        }
        else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInMonthLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            if (isLeapYear(year)) {
                return daysInMonthLeapYear[month-1];
            }
            else {
                return daysInMonth[month-1];
            }
        }
        else {
            return -1;
        }
    }
}
