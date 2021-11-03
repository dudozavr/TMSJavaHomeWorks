package by.tms.home_work_14.task_1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static by.tms.home_work_14.task_1.CollectionsUtils.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число для создания коллекции: ");
        List<Integer> list = getCollectionWithRandomIntNumbers(new Scanner(System.in).nextInt());

        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Создана коллекция с количеством случайных чисел равным введенному числу и удалены дубликаты");

        System.out.println("Четные числа в диапазоне индексов 7 - 17 (включительно):");
        getEvenIntsInDiapason(list, 6, 17).forEach(System.out::println);

        System.out.println("Первые отсорированные числа умноженные на 2:");
        getFirstDoubledAndSortedInts(list, 4).forEach(System.out::println);

        System.out.println("Количество элементов в стриме: " + (long) list.size());
        System.out.println("Среднее арифметическое всех чисел: " + getAverage(list));
    }
}
