package com.example.holiday.controller;

import com.example.holiday.Client.ClientType;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/holiday")
public class HolidayController {

    @Autowired
    @Qualifier("vendorService")
    CalendarService vendorService;

    @GetMapping("/client-type/{client-type}/id/{id}/processing-date/{processing-date}")
    @ResponseStatus(HttpStatus.OK)
    public boolean getHolidayStatus(@PathVariable(value = "client-type", required = true) String clientType, @PathVariable(value = "id", required = false) String vendorID, @PathVariable(value = "processing-date", required = false) String processingDate) {
        ClientType type = ClientType.valueOf(clientType);
        if(type.equals(ClientType.TSYS))
            return vendorService.isFederalHoliday(LocalDate.parse(processingDate));
        //return vendorService.isFederalHoliday();
        return true;
    }

}
