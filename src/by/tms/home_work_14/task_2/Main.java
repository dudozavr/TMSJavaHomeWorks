package by.tms.home_work_14.task_2;

import java.util.List;
import java.util.Scanner;

import static by.tms.home_work_14.task_2.CollectionsUtils.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите ваше имя: ");
        String name = new Scanner(System.in).next();
        List<String> list = getGroupStudents();

        System.out.printf("Количество имен %s = %d\n", name, getCountNames(list, name));
        System.out.printf("Количество имен начинающихся на %s = %d\n", "а", getCountOfNamesStartingWithLetter(list, "а"));
        System.out.printf("Первое имя отсортированого массива = %s\n", getFirstElementOfSortedList(list));
        System.out.printf("Первое имя отсортированого массива = %s\n", getFirstElementOfSortedList(List.of()));
    }
}
