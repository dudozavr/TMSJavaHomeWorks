package by.tms.home_work_1.task_1;

import java.util.Scanner;

public final class DigitUtils {

    private DigitUtils() {
    }

    public static int getInputNumber() {
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public static String getInfoAboutNumber(int inputNumber) {
        return inputNumber + " - это " + (isPositive(inputNumber) ? "положительное" : "отрицательное")
                + " " + getCountDigitsStatus(inputNumber) + " число";
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static String getCountDigitsStatus(int number) {
        return switch (String.valueOf(number).toCharArray().length) {
            case 1 -> "однозначное";
            case 2 -> "двухзначное";
            case 3 -> "трехзначное";
            default -> "более чем трехзначное";
        };
    }
}
