package com.example.holiday.config;

import com.example.holiday.modal.Vendor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("holiday")
public class MyAppProperties{

    private List<Vendor> vendors;

    public List<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(List<Vendor> vendors) {
        this.vendors = vendors;
    }

    @Override
    public String toString() {
        return "MyAppProperties{" +
                "vendors=" + vendors +
                '}';
    }

}
