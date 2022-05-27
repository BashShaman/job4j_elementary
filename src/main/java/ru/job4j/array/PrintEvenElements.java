package ru.job4j.array;

public class PrintEvenElements {
    public static String printEvenInts(int[] numbers) {
        String ln = System.lineSeparator();
        String res = "Элементы массива с чётными индексами, начиная с последнего: " + ln;
        int lastIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            int index = lastIndex - i;
            if (index % 2 == 0) {
                res += numbers[index] + ln;
            }
        }
        return res;
    }
}
