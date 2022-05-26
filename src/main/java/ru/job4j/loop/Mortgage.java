package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double factor = 1 + percent / 100;

        while (amount > 0) {
            amount *= factor;
            amount -= salary;
            year += 1;
        }

        return year;
    }
}
