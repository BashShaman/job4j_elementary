package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to76then5() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 7;
        int y2 = 6;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to97then10() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 9;
        int y2 = 7;
        double expected = 10;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to72then4() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 7;
        int y2 = 2;
        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}
