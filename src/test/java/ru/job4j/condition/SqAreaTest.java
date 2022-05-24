package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K5Square5() {
        double p = 12;
        double k = 5;
        double expected = 5;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K4Square16() {
        double p = 20;
        double k = 4;
        double expected = 16;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}
