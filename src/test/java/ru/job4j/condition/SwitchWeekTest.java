package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when0ThenError() {
        int in = 0;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void when1ThenMonday() {
        int in = 1;
        String expected = "Понедельник";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void when3ThenWednesday() {
        int in = 3;
        String expected = "Среда";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void when4ThenThursday() {
        int in = 4;
        String expected = "Четверг";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void when7ThenSunday() {
        int in = 7;
        String expected = "Воскресенье";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }

    @Test
    public void when8ThenError() {
        int in = 8;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(expected, out);
    }
}
