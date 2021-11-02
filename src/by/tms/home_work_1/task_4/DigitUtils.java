package by.tms.home_work_1.task_4;

public final class DigitUtils {

    private DigitUtils() {
    }

    public static int getCountOfPositiveDigits(int a, int b, int c) {
        return isPositive(a) + isPositive(b) + isPositive(c);
    }

    public static int isPositive(int number) {
        return number >= 0 ? 1 : 0;
    }
}
