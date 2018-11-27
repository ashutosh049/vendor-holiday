package com.example.holiday.service.impl;

import org.joda.time.LocalDate;

public enum FederalHolidays {

    NEW_YEAR(LocalDate.parse("2018-01-01")),

    MARTIN_LUTHER_KING_BIRTH_DAY(LocalDate.parse("2018-01-15")),

    GEORGE_WASHINGTON_BIRTH_DAY(LocalDate.parse("2018-02-19")),

    MEMORIAL_DAY(LocalDate.parse("2018-05-28")),

    INDEPENDENCE_DAY(LocalDate.parse("2018-07-04")),

    LABOR_DAY(LocalDate.parse("2018-09-03")),

    COLUMBUS_DAY(LocalDate.parse("2018-10-08")),

    VETERANS_DAY(LocalDate.parse("2018-11-12")),

    THANKSGIVING_DAY(LocalDate.parse("2018-11-22")),

    CHRISTMAS_DAY(LocalDate.parse("2018-12-25"));

    private LocalDate date;

    FederalHolidays(LocalDate date) {
        this.date = date;
    }
}
