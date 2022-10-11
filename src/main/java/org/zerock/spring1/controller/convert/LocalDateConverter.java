package org.zerock.spring1.controller.convert;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDateConverter implements Converter<String, LocalDate> {


    @Override
    public LocalDate convert(String source) {
        return LocalDate.parse(source, DateTimeFormatter.ISO_DATE);
    }
}
