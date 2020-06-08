package by.epamtc.jwd.task10;

import java.util.Scanner;

public class Task10 {
    private static int sign(int x) {
        return x > 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        int x;
        int size = 0;
        int prev = 0;

        boolean ascending = true;
        boolean equalNeighbours = false;
        boolean signStriped = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sequence ending by 0:");

        while ((x = scanner.nextInt()) != 0) {
            if (size > 0 && x <= prev) {
                ascending = false;
            }

            if (size > 0 && x == prev) {
                equalNeighbours = true;
            }

            if (size > 0 && sign(x) == sign(prev)) {
                signStriped = false;
            }

            size += 1;
            prev = x;
        }

        if (size < 2) {
            System.out.println("Invalid sequence");
            return;
        }

        System.out.printf("\nResult of Task9:\n-ascending: %b\n-has equal neighbours: %b\n-sign striped: %b\n",
                ascending, equalNeighbours, signStriped
        );
    }
}
