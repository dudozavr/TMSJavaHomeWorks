package by.tms.home_work_13.task_2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static by.tms.home_work_13.task_2.DateUtils.getNextTuesdayDate;

public class Main {

    private static final int DAY_OF_WEEK_TO_CHEK = Calendar.TUESDAY;

    public static void main(String[] args) {
        System.out.println(getNextTuesdayDate(new Date(), DAY_OF_WEEK_TO_CHEK));
        System.out.println(getNextTuesdayDate(new GregorianCalendar(2021, Calendar.OCTOBER, 2).getTime(), DAY_OF_WEEK_TO_CHEK));
        System.out.println(getNextTuesdayDate(new GregorianCalendar(2021, Calendar.OCTOBER, 6).getTime(), DAY_OF_WEEK_TO_CHEK));
        System.out.println(getNextTuesdayDate(new GregorianCalendar(2021, Calendar.NOVEMBER, 3).getTime(), DAY_OF_WEEK_TO_CHEK));
    }
}
