package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int indexLast = data.length - 1;
        for (int index = 0; index < indexLast; index++) {
            int minItem = MinDiapason.findMin(data, index, indexLast);
            int minIndex = FindLoop.indexInRange(data, minItem, index, indexLast);
            SwitchArray.swap(data, minIndex, index);
        }
        return data;
    }
}
