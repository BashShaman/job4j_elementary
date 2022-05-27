package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                boolean onlyNull = true;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        onlyNull = false;
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                }
                if (onlyNull) {
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
