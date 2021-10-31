package by.tms.home_work_13.task_2;

import java.util.Calendar;
import java.util.Date;

public final class DateUtils {

    private DateUtils() {
    }

    public static Date getNextTuesdayDate(Date date, int dayOfWeek) {
        if (date == null || dayOfWeek > 7) {
            System.out.println("Incorrect data");
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.get(Calendar.DAY_OF_WEEK) == dayOfWeek) {
            return calendar.getTime();
        }
        calendar.add(Calendar.DAY_OF_WEEK, getCountOfDaysToDayOfWeek(calendar, dayOfWeek));
        return calendar.getTime();
    }

    private static int getCountOfDaysToDayOfWeek(Calendar calendar, int dayOfWeek) {
        if (dayOfWeek > calendar.get(Calendar.DAY_OF_WEEK)) {
            return dayOfWeek - calendar.get(Calendar.DAY_OF_WEEK);
        } else {
            return 7 - calendar.get(Calendar.DAY_OF_WEEK) + dayOfWeek;
        }
    }
}
