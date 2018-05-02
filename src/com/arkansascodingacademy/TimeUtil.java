package com.arkansascodingacademy;

import java.time.LocalTime;

@SuppressWarnings("WeakerAccess")
public class TimeUtil
{
    //Return true if it is after 12PM and before 4PM
    public static boolean isAfternoon(LocalTime time)
    {
        boolean afternoon = false;

        if (time.isAfter(LocalTime.of(12,0)) && time.isBefore(LocalTime.of(16,0)))
            afternoon = true;

        return afternoon;
    }

    //Return true if it is after midnight and before 4AM
    public static boolean isAfterMidnight(LocalTime time)
    {
        boolean afterMidnight = false;

        if (time.isAfter(LocalTime.of(0,0)) && time.isBefore(LocalTime.of(4,0)))
            afterMidnight = true;

            return afterMidnight;
    }
}
