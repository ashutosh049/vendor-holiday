import java.io.Serializable;
import java.util.Set;


public interface ReadOnlyHolidayCalendar<E> extends Serializable {
    Set<E> getHolidays();
}