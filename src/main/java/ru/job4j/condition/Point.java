package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return sqrt(pow(x - that.x, 2) + pow(y - that.y, 2));
    }

    public static void main(String[] args) {
        Point p0 = new Point(0, 0);
        Point p1 = new Point(2, 0);
        double result = p0.distance(p1);
        System.out.printf("result (%d, %d) to (%d, %d) %.2f\n",
                p0.getX(), p0.getY(), p1.getX(), p1.getY(), result);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(-10, -5);
        result = p2.distance(p3);
        System.out.printf("result (%d, %d) to (%d, %d) %.2f\n",
                p2.getX(), p2.getY(), p3.getX(), p3.getY(), result);
        Point p4 = new Point(5, 0);
        Point p5 = new Point(-30, -50);
        result = p4.distance(p5);
        System.out.printf("result (%d, %d) to (%d, %d) %.2f\n",
                p4.getX(), p4.getY(), p5.getX(), p5.getY(), result);
    }
}
