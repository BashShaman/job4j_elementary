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

    @Test
    public void whenMax1To2To3Then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int expected = 3;
        int out = Max.max(a, b, c);
        assertEquals(expected, out);
    }

    @Test
    public void whenMax1To20To3Then20() {
        int a = 1;
        int b = 20;
        int c = 3;
        int expected = 20;
        int out = Max.max(a, b, c);
        assertEquals(expected, out);
    }

    @Test
    public void whenMax10To2To3Then10() {
        int a = 10;
        int b = 2;
        int c = 3;
        int expected = 10;
        int out = Max.max(a, b, c);
        assertEquals(expected, out);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int expected = 4;
        int out = Max.max(a, b, c, d);
        assertEquals(expected, out);
    }

    @Test
    public void whenMax10To2To3To4Then10() {
        int a = 10;
        int b = 2;
        int c = 3;
        int d = 4;
        int expected = 10;
        int out = Max.max(a, b, c, d);
        assertEquals(expected, out);
    }
}
