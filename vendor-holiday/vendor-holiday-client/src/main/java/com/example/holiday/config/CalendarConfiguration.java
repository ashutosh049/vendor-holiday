package com.example.holiday.config;

import com.example.holiday.service.impl.VendorHoliday;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalendarConfiguration {

    @Bean
    CalendarService tsysService() {
        return new TSYSHoliday();
    }

    @Bean
    CalendarService vendorService() {
        return new VendorHoliday();
    }
}
