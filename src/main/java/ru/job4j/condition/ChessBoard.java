package ru.job4j.condition;

public class ChessBoard {
    private static boolean isNotValid(int coordinate) {
        return coordinate < 0 || coordinate > 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;

        if (isNotValid(x1) || isNotValid(y1)
                || isNotValid(x2) || isNotValid(y2)) {
            return rsl;
        }

        if (Math.abs(x2 - x1) != Math.abs(y2 - y1)) {
            return rsl;
        }

        return Math.abs(x2 - x1);
    }
}
