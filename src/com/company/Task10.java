package com.company;

import java.util.Scanner;

public class Task10 {
    private static int sign(int x) {
        return x > 0 ? 1 : -1;
    }

    public static String solve() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int n = 0;
        int prev = 0;

        boolean ascending = true;
        boolean equalNeighbours = false;
        boolean signStriped = true;

        while ((x = scanner.nextInt()) != 0) {
            if (n > 0 && x <= prev) {
                ascending = false;
            }

            if (n > 0 && x == prev) {
                equalNeighbours = true;
            }

            if (n > 0 && sign(x) == sign(prev)) {
                signStriped = false;
            }

            n += 1;
            prev = x;
        }

        if (n < 2) {
            return "Invalid sequence";
        }

        String result = "";
        result += String.format("The sequence with %d numbers:\n", n);
        if (ascending) {
            result += "- ascending\n";
        }
        if (equalNeighbours) {
           result += "- has equal neighbours\n";
        }
        if (signStriped) {
            result += "- sign striped";
        }

        return result;
    }

}
