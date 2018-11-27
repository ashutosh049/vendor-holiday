package com.example.holiday.service;

import java.io.Serializable;
import java.util.Set;

public interface HolidayService<E> extends FederalHolidayService<E> {

    HolidayService<E> setHolidays(final Set<E> holidays);

    Set<E> getHolidays();

    boolean isHoliday(final E date);

}