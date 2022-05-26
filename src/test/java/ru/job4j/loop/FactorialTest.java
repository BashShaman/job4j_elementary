package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int out = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int out = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int n = 1;
        int out = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForTwoThenTwo() {
        int n = 2;
        int out = Factorial.calc(n);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForThreeThenSix() {
        int n = 3;
        int out = Factorial.calc(n);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }
}
