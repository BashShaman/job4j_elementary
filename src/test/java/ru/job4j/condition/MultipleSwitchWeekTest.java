package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        String in = "Monday";
        int expected = 1;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenSundayRuThen7() {
        String in = "Воскресенье";
        int expected = 7;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenFreitagThenMinus1() {
        String in = "Freitag";
        int expected = -1;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertEquals(expected, out);
    }
}
