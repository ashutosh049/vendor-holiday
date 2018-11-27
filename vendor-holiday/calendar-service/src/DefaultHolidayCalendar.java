import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class DefaultHolidayCalendar<E extends Serializable> implements HolidayCalendar<E> {

    private Map<String, E> holidays;

    public DefaultHolidayCalendar() {
        super();
        holidays = Collections.emptyMap();
    }

    public DefaultHolidayCalendar(final Set<E> holidays) {
        super();
        setHolidays(holidays);
    }


    public Set<E> getHolidays() {
        return new HashSet<E>(holidays.values());
    }


    public final HolidayCalendar<E> setHolidays(final Set<E> holidays) {

        if (holidays == null) {
            this.holidays = Collections.emptyMap();
            return this;
        }

        final Map<String, E> calendar = new TreeMap<String, E>();
        for (final E e : holidays) {
            calendar.put(toString(e), e);
        }
        this.holidays = Collections.unmodifiableMap(calendar);
        return this;
    }

    public boolean isHoliday(final E date) {
        return holidays.containsKey(toString(date));
    }

    private String toString(final E date) {
        if (date instanceof Calendar) {
            return new SimpleDateFormat("yyyy-MM-dd").format(((Calendar) date).getTime());
        }
        else if (date instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        }

        return date != null ? date.toString() : "";
    }
}