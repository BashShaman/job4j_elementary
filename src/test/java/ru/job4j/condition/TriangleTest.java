package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        assertTrue(Triangle.exist(ab, ac, bc));
    }

    @Test
    public void whenNotExist() {
        double ab = 12.0;
        double ac = 2.0;
        double bc = 2.0;
        assertFalse(Triangle.exist(ab, ac, bc));
    }
}
