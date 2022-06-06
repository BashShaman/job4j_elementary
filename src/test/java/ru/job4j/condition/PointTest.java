package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point p0 = new Point(0, 0);
        Point p1 = new Point(2, 0);
        double expected = 2;
        double out = p0.distance(p1);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to76then5() {
        Point p0 = new Point(4, 2);
        Point p1 = new Point(7, 6);
        double expected = 5;
        double out = p0.distance(p1);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to97then10() {
        Point p0 = new Point(1, 1);
        Point p1 = new Point(9, 7);
        double expected = 10;
        double out = p0.distance(p1);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to72then4() {
        Point p0 = new Point(3, 2);
        Point p1 = new Point(7, 2);
        double expected = 4;
        double out = p0.distance(p1);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX3Y3Z3ToX0Y0Z0Then5dot2() {
        Point p0 = new Point(3, 3, 3);
        Point p1 = new Point(0, 0, 0);
        double expected = 5.2;
        double out = p0.distance3d(p1);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10Y15Z20ToX5Y10Z15Then8dot66() {
        Point p0 = new Point(10, 15, 20);
        Point p1 = new Point(5, 10, 15);
        double expected = 8.66;
        double out = p0.distance3d(p1);
        assertEquals(expected, out, 0.01);
    }
}
