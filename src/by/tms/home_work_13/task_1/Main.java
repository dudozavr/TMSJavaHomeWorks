package by.tms.home_work_13.task_1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static by.tms.home_work_13.task_1.DateUtils.getDayOfWeek;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(new Date()));
        System.out.println(getDayOfWeek(new Date(123123123)));
        System.out.println(getDayOfWeek(new Date(1231234323)));
        System.out.println(getDayOfWeek(new GregorianCalendar(2021, Calendar.JANUARY, 1).getTime()));
    }
}
