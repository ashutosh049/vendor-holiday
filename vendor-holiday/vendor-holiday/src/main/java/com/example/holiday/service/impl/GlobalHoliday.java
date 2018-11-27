package com.example.holiday.service.impl;

import com.example.holiday.service.HolidayService;
import org.joda.time.LocalDate;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class GlobalHoliday<E extends Serializable> implements HolidayService<E> {

    private Map<String, E> holidays;

    public GlobalHoliday() {
        super();
        holidays = Collections.emptyMap();
    }

    public GlobalHoliday(final Set<E> holidays) {
        super();
        setHolidays(holidays);
    }

    @Override
    public Set<E> getHolidays() {
        return new HashSet<E>(holidays.values());
    }

    @Override
    public final HolidayService<E> setHolidays(final Set<E> holidays) {

        if (holidays == null) {
            this.holidays = Collections.emptyMap();
            return this;
        }

        this.holidays = Collections.unmodifiableMap(holidays.stream().collect(
                Collectors.toMap(
                        e -> toString(e),
                        Function.identity(),
                        (v1, v2) -> {
                            throw new RuntimeException(String.format("Duplicate key for values %s and %s", v1, v2));
                        },
                        TreeMap::new)));
        return this;
    }

    @Override
    public boolean isHoliday(final E date) {
        return holidays.containsKey(toString(date));
    }

    private String toString(final E date) {
        if (date instanceof LocalDate) {
            return ((LocalDate) date).toString();
        }
        return date != null ? date.toString() : "";
    }


}