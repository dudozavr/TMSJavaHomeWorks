package by.tms.home_work_1.task_5;

public final class DigitUtils {

    private DigitUtils() {
    }

    public static void showInfoAboutDigits(int a, int b, int c) {
        System.out.println("Количество положительных цифр: " + getCountOfPositiveDigits(a, b, c));
        System.out.println("Количество отрицательных цифр: " + getCountOfNegativeDigits(a, b, c));
    }

    public static int getCountOfNegativeDigits(int a, int b, int c) {
        return isNegative(a) + isNegative(b) + isNegative(c);
    }

    public static int getCountOfPositiveDigits(int a, int b, int c) {
        return isPositive(a) + isPositive(b) + isPositive(c);
    }

    public static int isPositive(int number) {
        return number >= 0 ? 1 : 0;
    }

    public static int isNegative(int number) {
        return number < 0 ? 1 : 0;
    }
}
