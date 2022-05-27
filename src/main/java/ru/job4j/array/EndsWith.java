package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lastWordIndex = word.length - 1;
        int lastPostIndex = post.length - 1;
        for (int i = 0; i < post.length; i++) {
            if (post[lastPostIndex - i] != word[lastWordIndex - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
