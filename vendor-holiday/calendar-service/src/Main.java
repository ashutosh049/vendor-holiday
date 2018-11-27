import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

public class Main {

    final static Set<LocalDate> holidays = new HashSet<LocalDate>();
    private static HolidayCalendar<LocalDate> holidayCalendar;

    static {
        holidays.add(LocalDate.parse("2009-04-22"));
        holidays.add(LocalDate.parse("2009-04-23"));
        holidays.add(LocalDate.parse("2009-04-24"));
        holidayCalendar = new DefaultHolidayCalendar<LocalDate>(holidays);
    }

    public static void main(String[] args) {

        LocalDate testLocalDate = LocalDate.parse("2009-04-22");
        System.out.println(testLocalDate.toString() + " isHoliday : " + holidayCalendar.isHoliday(testLocalDate));

        testLocalDate = LocalDate.parse("2009-04-25");
        System.out.println(testLocalDate.toString() + " isHoliday : " + holidayCalendar.isHoliday(testLocalDate));

    }


}
