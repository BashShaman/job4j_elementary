package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        double result;

        x1 = 0; y1 = 0; x2 = 2; y2 = 0;
        result = Point.distance(x1, y1, x2, y2);
        System.out.printf("result (%d, %d) to (%d, %d) %.2f\n",
                x1, y1, x2, y2, result);

        x1 = 10; y1 = 20; x2 = -10; y2 = -5;
        result = Point.distance(x1, y1, x2, y2);
        System.out.printf("result (%d, %d) to (%d, %d) %.2f\n",
                x1, y1, x2, y2, result);

        x1 = 5; y1 = 0; x2 = -30; y2 = -50;
        result = Point.distance(x1, y1, x2, y2);
        System.out.printf("result (%d, %d) to (%d, %d) %.2f\n",
                x1, y1, x2, y2, result);
    }
}
