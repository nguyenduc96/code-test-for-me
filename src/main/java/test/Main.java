package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        log();
    }

    private static void log(Object... objects) {
        System.out.println(Arrays.toString(objects));
    }
}
