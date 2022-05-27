package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {9, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf12elements() {
        int[] data = new int[] {10, 7, 2, -4, -8, 9, 3, -2, -7, 2, -1, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-8, -7, -4, -2, -1, 2, 2, 3, 6, 7, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}
