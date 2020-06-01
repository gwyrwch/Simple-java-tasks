package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;


public class Task2 {

    private static boolean isValidDay(int dayNumber) {
        return dayNumber >= 1 && dayNumber <= 365;
    }

    private static boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public static Pair<String, Integer> solve(int year, int dayNumber) {
        if (isValidDay(dayNumber) && isLeapYear(year)) {
            LocalDate myDate = LocalDate.of(year, Month.JANUARY, 1).plusDays(dayNumber - 1);
            return new Pair<>(myDate.getMonth().toString(), myDate.getDayOfMonth());
        }

        return null;
    }
}
