package by.tms.home_work_14.task_2;

import java.util.List;
import java.util.Optional;

public final class CollectionsUtils {

    private CollectionsUtils() {
    }

    public static List<String> getGroupStudents() {
        return List.of(
                "Александр Пертов",
                "Александр Иванов",
                "Александр Сидоров",
                "Сергей Пертов",
                "Юрий Иванов",
                "Иван Иванов",
                "Юрий Сидоров",
                "Виталий Иванов",
                "Евгений Сидоров"
        );
    }

    public static long getCountNames(List<String> listOfNames, String name) {
        return listOfNames.stream()
                .filter(n -> n.toLowerCase().contains(name.toLowerCase()))
                .count();
    }

    public static long getCountOfNamesStartingWithLetter(List<String> listOfNames, String ltr) {
        return listOfNames.stream()
                .filter(n -> n.toLowerCase().startsWith(ltr.toLowerCase()))
                .count();
    }

    public static String getFirstElementOfSortedList(List<String> listOfNames) {
        Optional<String> optional = listOfNames.stream().sorted().findFirst();
        return optional.orElse("Empty");
    }
}
