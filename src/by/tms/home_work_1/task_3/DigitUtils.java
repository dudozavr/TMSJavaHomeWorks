package by.tms.home_work_1.task_3;

import java.util.Scanner;

public final class DigitUtils {

    private DigitUtils() {
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static int getInputNumber() {
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}
