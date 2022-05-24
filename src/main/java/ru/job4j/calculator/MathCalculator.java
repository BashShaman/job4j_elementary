package ru.job4j.calculator;

import static ru.job4j.math.MathFucntion.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double accumulateBasicMathOperationsResults(double first,
                                                              double second) {
        return sum(first, second) + multiply(first, second)
                + subtract(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        float first = 20;
        float second = 10;
        System.out.printf("sumAndMultiple(%.2f, %.2f) = %.2f\n",
                first, second, sumAndMultiply(first, second));
        System.out.printf("subtractAndDivide(%.2f, %.2f) = %.2f\n",
                first, second, subtractAndDivide(first, second));
        System.out.printf("%s(%.2f, %.2f) = %.2f\n",
                "accumulateBasicMathOperationsResults",
                first, second,
                accumulateBasicMathOperationsResults(first, second));
    }
}
