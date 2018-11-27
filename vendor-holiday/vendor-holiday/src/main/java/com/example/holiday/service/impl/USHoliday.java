package com.example.holiday.service.impl;

import org.joda.time.LocalDate;

public class USHoliday extends GlobalHoliday {

    FederalHolidays federalHolidays;

    @Override
    public boolean isNewYear(LocalDate argLocalDate) {
        if(argLocalDate.equals(federalHolidays.NEW_YEAR))
            return true;

        return false;
    }

    @Override
    public boolean isMartinLutherKingBirthDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isGeorgeWashingtonBirthDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isMemorialDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isIndependenceDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isLaborDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isColumbusDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isVeteransDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isThanksgivingDay(LocalDate argLocalDate) {
        return false;
    }

    @Override
    public boolean isChristmasDay(LocalDate argLocalDate) {
        return false;
    }
}
