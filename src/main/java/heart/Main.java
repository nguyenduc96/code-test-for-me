package heart;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        printHeart();
    }

    private static char[] convertCodePointToEmoji(@NotNull String code) {
        return Character.toChars(Integer.valueOf(code.substring(2), 16));
    }

    private static void printHeart() {
        final int N = 10;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= 4 * N; j++) {
                double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
                double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));

                if (d1 < N + 0.5 || d2 < N + 0.5) {
                    System.out.print(convertCodePointToEmoji("U+2764"));
                } else {
                    System.out.print(convertCodePointToEmoji("U+1F90D"));
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int i = 1; i < 2 * N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(convertCodePointToEmoji("U+1F90D"));
            }

            for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
                System.out.print(convertCodePointToEmoji("U+2764"));
            }

            System.out.print(System.lineSeparator());
        }
    }
}
