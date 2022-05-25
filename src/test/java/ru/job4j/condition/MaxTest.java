package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }

    @Test
    public void whenMax100to20Then100() {
        int left = 100;
        int right = 20;
        int expected = 100;
        int out = Max.max(left,  right);
        assertEquals(expected, out);
    }

    @Test
    public void whenMax200To500Then500() {
        int left = 200;
        int right = 500;
        int expected = 500;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }

    @Test
    public void when5000To5000Then5000() {
        int left = 5_000;
        int right = 5_000;
        int expected = 5_000;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }
}
