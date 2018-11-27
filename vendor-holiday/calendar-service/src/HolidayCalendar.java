import java.util.Set;

public interface HolidayCalendar<E> extends ReadOnlyHolidayCalendar<E> {

    HolidayCalendar<E> setHolidays(final Set<E> holidays);

    boolean isHoliday(final E date);
}