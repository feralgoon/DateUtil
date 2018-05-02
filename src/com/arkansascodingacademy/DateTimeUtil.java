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

        //if day of week is (1-4), or Monday through Thursday
        if (dateTime.getDayOfWeek().getValue() >= 1 && dateTime.getDayOfWeek().getValue() <= 4)
        {
            //if time of day is 4pm or after (calculated inclusive, so used 15:59:59)
            if (dateTime.toLocalTime().isAfter(LocalTime.of(15,59,59)))
            {
                //if time of day is before 7pm
                if (dateTime.toLocalTime().isBefore(LocalTime.of(19,0)))
                {
                    isHappyHour = true;
                }
            }
        }
        //if day of week is (5), or Friday
        if (dateTime.getDayOfWeek().getValue() == 5)
        {
            //if time of day is 4pm or after (calculated inclusive, so used 15:59:59)
            if (dateTime.toLocalTime().isAfter(LocalTime.of(15,59,59)))
            {
                //if time of day is before 6pm
                if (dateTime.toLocalTime().isBefore(LocalTime.of(18,0)))
                {
                    isHappyHour = true;
                }
            }
        }

        return isHappyHour;
    }
}
