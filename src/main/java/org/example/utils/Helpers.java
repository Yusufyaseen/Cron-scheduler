package org.example.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Helpers {
    public static long convertToMilliSeconds(LocalDateTime localDateTime){
        ZonedDateTime zdt = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
        long date = zdt.toInstant().toEpochMilli();
        return date;
    }
    public static long convertToMilliSeconds(double time){
        double period = time * 60 * Math.pow(10, 3);
        return (long) period;
    }

    public static long getActualHelper(LocalDateTime localDateTime){
        return convertToMilliSeconds(localDateTime) - convertToMilliSeconds(LocalDateTime.now());
    }
    public static LocalDateTime getLocalDateTime(int year, int month, int day, int hour, int min, int sec){
        return LocalDateTime.of(
                year, month, day, hour, min,sec);
    }
}
