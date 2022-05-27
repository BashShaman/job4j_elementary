package ru.job4j.array;

public class EqLast {
    public static int getLastItem(int[] array) {
        return array[array.length - 1];
    }

    public static boolean check(int[] left, int[] right) {
        return getLastItem(left) == getLastItem(right);
    }
}
