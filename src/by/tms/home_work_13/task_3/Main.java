package by.tms.home_work_13.task_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        if (inputNumber != 1 && inputNumber != 2) {
            System.out.println("Incorrect data");
            return;
        }
        Magical magical = getLogic(inputNumber);
        if (inputNumber == 1) {
            System.out.print("Enter string to reverse:" + System.lineSeparator());
            System.out.println(magical.createMagic(sc.nextLine()));
        } else {
            System.out.print("Enter number to get factorial: ");
            System.out.println(magical.createMagic(sc.nextInt()));
        }
    }

    public static Magical getLogic(int inputNumber) {
        if (inputNumber == 1) {
            return (Magical<String>) str -> new StringBuilder(str).reverse().toString();
        } else {
            return (Magical<Integer>) number -> {
                int result = 1;
                for (int i = 1; i <= number; i++) {
                    result *= i;
                }
                return result;
            };
        }
    }
}
