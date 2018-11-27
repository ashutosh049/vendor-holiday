package com.example.holiday.service;

import org.joda.time.LocalDate;

import java.io.Serializable;

public interface FederalHolidayService<E> extends Serializable {

    boolean isNewYear(LocalDate argLocalDate);

    boolean isMartinLutherKingBirthDay(LocalDate argLocalDate);

    boolean isGeorgeWashingtonBirthDay(LocalDate argLocalDate);

    boolean isMemorialDay(LocalDate argLocalDate);

    boolean isIndependenceDay(LocalDate argLocalDate);

    boolean isLaborDay(LocalDate argLocalDate);

    boolean isColumbusDay(LocalDate argLocalDate);

    boolean isVeteransDay(LocalDate argLocalDate);

    boolean isThanksgivingDay(LocalDate argLocalDate);

    boolean isChristmasDay(LocalDate argLocalDate);

}
