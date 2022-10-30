package com.emexo.dateandtime;

import java.time.*;
import java.time.chrono.ChronoZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

    public static void main(String[] args) {

        // Date
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.parse("2022-07-25"));
        System.out.println(LocalDate.parse("2022-07-25").getDayOfWeek());
        System.out.println(LocalDate.parse("2022-07-25").getDayOfMonth());
        System.out.println(LocalDate.of(2021, 9,  01));
        System.out.println(LocalDate.now().plusDays(3));
        System.out.println(LocalDate.now().plus(3, ChronoUnit.DAYS));
        System.out.println(LocalDate.now().plus(2, ChronoUnit.MONTHS));
        System.out.println(LocalDate.now().minus(1, ChronoUnit.DAYS));
        System.out.println(LocalDate.now().minus(1, ChronoUnit.MONTHS));
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfYear());
        //System.out.println(LocalDate.now().withDayOfYear(2021));
     //   System.out.println(;

        // Time
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(07, 40));
        System.out.println(LocalTime.parse("12:30"));
        System.out.println(LocalTime.parse("12:30").getHour());
        System.out.println(LocalTime.now().minus(1, ChronoUnit.HOURS));
        System.out.println(LocalTime.now().minus(2, ChronoUnit.HOURS));

        // Date and Time
        System.out.println(LocalDateTime.now());

        // International time
        ZoneId zid = ZoneId.of("Europe/Paris");
        ZonedDateTime zt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), zid);
        System.out.println("ZonedDateTime: "+ zt);
        System.out.println(ZonedDateTime.now(Clock.systemUTC()));

    }
}
