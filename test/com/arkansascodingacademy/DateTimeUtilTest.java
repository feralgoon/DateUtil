package com.arkansascodingacademy;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilTest
{
    private static final LocalDateTime HAPPY_HOUR_START_MON = LocalDateTime.of(2018,4,30,4,0);
    private static final LocalDateTime HAPPY_HOUR_START_FRI = LocalDateTime.of(2018,5,4,4,0);
    private static final LocalDateTime HAPPY_HOUR_START_THU = LocalDateTime.of(2018,5,3,4,0);
    private static final LocalDateTime HAPPY_HOUR_END_MON = LocalDateTime.of(2018,4,30,7,0);
    private static final LocalDateTime HAPPY_HOUR_END_FRI = LocalDateTime.of(2018,5,4,6,0);
    private static final LocalDateTime HAPPY_HOUR_END_THU = LocalDateTime.of(2018,5,3,7,0);
    private static final LocalDateTime HAPPY_HOUR_START_TUE = LocalDateTime.of(2018,5,1,4,0);
    private static final LocalDateTime HAPPY_HOUR_SUNDAY = LocalDateTime.of(2018,4,29,4,0);


    @Test
    void isHappyHour()
    {
        assertTrue(DateTimeUtil.isHappyHour(HAPPY_HOUR_START_MON));
        assertTrue(DateTimeUtil.isHappyHour(HAPPY_HOUR_START_THU));
        assertTrue(DateTimeUtil.isHappyHour(HAPPY_HOUR_START_FRI));
        assertFalse(DateTimeUtil.isHappyHour(HAPPY_HOUR_END_MON));
        assertFalse(DateTimeUtil.isHappyHour(HAPPY_HOUR_END_FRI));
        assertFalse(DateTimeUtil.isHappyHour(HAPPY_HOUR_END_THU));
        assertTrue(DateTimeUtil.isHappyHour(HAPPY_HOUR_START_TUE));
        assertFalse(DateTimeUtil.isHappyHour(HAPPY_HOUR_SUNDAY));

    }
}