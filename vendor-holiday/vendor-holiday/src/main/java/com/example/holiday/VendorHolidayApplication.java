package com.example.holiday;

import com.example.holiday.config.MyAppProperties;
import com.example.holiday.modal.Vendor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class VendorHolidayApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(VendorHolidayApplication.class, args);
        MyAppProperties bean = context.getBean(MyAppProperties.class);
        List<Vendor> vendors = bean.getVendors();
        vendors.forEach(vendor -> System.out.println(vendor.getHolidays()));
        System.out.println(bean);
    }
}
