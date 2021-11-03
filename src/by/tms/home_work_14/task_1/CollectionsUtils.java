package by.tms.home_work_14.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public final class CollectionsUtils {

    private CollectionsUtils() {
    }

    public static List<Integer> getCollectionWithRandomIntNumbers(int count) {
        List<Integer> list = new ArrayList<>(count);
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(10_000));
        }
        return list;
    }

    public static List<Integer> getEvenIntsInDiapason(List<Integer> list, int startIndex, int endIndex) {
        return list.stream()
                .limit(endIndex + 1)
                .skip(startIndex)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> getFirstDoubledAndSortedInts(List<Integer> list, int countToCut) {
        return list.stream().map(i -> i * 2).sorted().limit(countToCut).collect(Collectors.toList());
    }

    public static double getAverage(List<Integer> list) {
        return (double) list.stream().reduce(Integer::sum).get() / list.size();
    }
}
