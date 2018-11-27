package com.example.holiday.service.impl;

import org.joda.time.LocalDate;

public class VendorHoliday implements CalendarService {
    @Override
    public boolean isFederalHoliday(LocalDate argLocalDate) {
        return false;
    }
}
