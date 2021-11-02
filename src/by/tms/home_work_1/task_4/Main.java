package by.tms.home_work_1.task_4;

import static by.tms.home_work_1.task_4.DigitUtils.getCountOfPositiveDigits;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCountOfPositiveDigits(1, 2, 3));
        System.out.println(getCountOfPositiveDigits(1, -2, 3));
        System.out.println(getCountOfPositiveDigits(1, -2, -3));
        System.out.println(getCountOfPositiveDigits(-1, -2, -3));
    }
}
