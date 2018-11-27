package com.example.holiday.test;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTime());
    }
}
