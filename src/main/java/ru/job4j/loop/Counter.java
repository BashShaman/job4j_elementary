package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int number = start; number <= finish; number++) {
            sum = sum + number;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int number = (start % 2 == 0) ? start : start + 1;
        for (; number <= finish; number += 2) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 5));
        System.out.println(sum(3, 7));
    }
}
