package by.tms.home_work_1.task_3;

import static by.tms.home_work_1.task_3.DigitUtils.getInputNumber;
import static by.tms.home_work_1.task_3.DigitUtils.isPositive;

public class Main {

    public static void main(String[] args) {
        int inputDigit = getInputNumber();
        if (inputDigit == 0) {
            System.out.println(10);
        }
        else if(isPositive(inputDigit)) {
            System.out.println(++inputDigit);
        } else {
            System.out.println(inputDigit - 2);
        }
    }
}
