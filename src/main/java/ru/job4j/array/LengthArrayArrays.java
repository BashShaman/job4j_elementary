package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        char[][] arraysOfChars = {{'a'}, {'a', 'b'}, {'a', 'b', 'c'},
                {'a', 'b', 'c', 'd'}};
        for (char[] chars : arraysOfChars) {
            System.out.printf("The length of the first inner array is %d.\n",
                    chars.length);
        }
    }
}
