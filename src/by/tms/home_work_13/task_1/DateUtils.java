package by.tms.home_work_13.task_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {

    private DateUtils() {
    }

    public static String getDayOfWeek(Date date) {
        return new SimpleDateFormat("EEEE").format(date);
    }
}
