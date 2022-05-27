package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            SwitchArray.swap(array, left, right);
            left++;
            right--;
        }
        return array;
    }
}