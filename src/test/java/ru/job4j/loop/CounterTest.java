package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTenThenTen() {
        int start = 10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromElevenToElevenThenZero() {
        int start = 11;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwelveToFourteenThenTwentySix() {
        int start = 12;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 26;
        Assert.assertEquals(expected, result);
    }
}
