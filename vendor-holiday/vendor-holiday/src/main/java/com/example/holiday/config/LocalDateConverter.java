package com.example.holiday.config;

import org.joda.time.LocalDate;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


@Component
@ConfigurationPropertiesBinding
public class LocalDateConverter implements Converter<String, List<LocalDate>> {

    @Override
    public List<LocalDate> convert(String source) {
        return source == null ? null : Arrays.stream(StringUtils.commaDelimitedListToStringArray(source.trim())).map(this::parse).collect(toList());
    }

    private LocalDate parse(String argString) {
        return LocalDate.parse(argString);
    }
}