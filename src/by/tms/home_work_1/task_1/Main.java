package by.tms.home_work_1.task_1;

import static by.tms.home_work_1.task_1.DigitUtils.getInfoAboutNumber;
import static by.tms.home_work_1.task_1.DigitUtils.getInputNumber;

public class Main {

    public static void main(String[] args) {
        int inputNumber = getInputNumber();
        System.out.println(getInfoAboutNumber(inputNumber));
    }
}
