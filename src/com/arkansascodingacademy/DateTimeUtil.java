package com.arkansascodingacademy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SuppressWarnings("WeakerAccess")
public class DateTimeUtil
{
    //Return true is it is happy hour
    //Happy hour is 4 to 7 Mon-Thur and 4 to 6 on Friday
    public static boolean isHappyHour(LocalDateTime dateTime)
    {
        boolean isHappyHour = false;

        if (dateTime.getDayOfWeek().getValue() >= 1 && dateTime.getDayOfWeek().getValue() <= 4)
        {
            if (dateTime.toLocalTime().isAfter(LocalTime.of(3,59,59)))
            {
                if (dateTime.toLocalTime().isBefore(LocalTime.of(7,0)))
                {
                    isHappyHour = true;
                }
            }
        }

        if (dateTime.getDayOfWeek().getValue() == 5)
        {
            if (dateTime.toLocalTime().isAfter(LocalTime.of(3,59,59)))
            {
                if (dateTime.toLocalTime().isBefore(LocalTime.of(6,0)))
                {
                    isHappyHour = true;
                }
            }
        }

        return isHappyHour;
    }
}
