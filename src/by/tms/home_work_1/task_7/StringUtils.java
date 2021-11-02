package by.tms.home_work_1.task_7;

public final class StringUtils {

    private StringUtils() {
    }

    public static String getDeclination(int count) {
        int numberToCheck = count % 100;
        if (numberToCheck > 10 && numberToCheck < 15) {
            return "программистов";
        }
        numberToCheck = count % 10;
        if (numberToCheck == 1) {
            return "программист";
        } else if (numberToCheck > 1 && numberToCheck < 5) {
            return "программиста";
        } else {
            return "программистов";
        }
    }

}
