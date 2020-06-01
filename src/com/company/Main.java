package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Result of Task1:");
        System.out.println(Task1.solve(1d, 1d, 1d));

        {
            System.out.println("\nResult of Task2:");

            Pair<String, Integer> result = Task2.solve(2020, 100);
            if (result != null) {
                System.out.printf("Month: %s, Day: %d\n", result.getFirst(), result.getSecond());
            }
        }

        System.out.println("\nResult of Task3:");
        SuperDouble doubleValues = new SuperDouble(-5d, 4d, 3d);
        Task3.solve(doubleValues);
        System.out.println(doubleValues);

        System.out.println("\nResult of Task4:");
        System.out.println(Task4.solve(12d));
        System.out.println(Task4.solve(14d));


        {
            int[] result = Task5.solve(123);
            System.out.println("\nResult of Task5:");

            if (result != null) {
                System.out.printf(
                    "Sum of digits: %d\nProduct of digits: %d\nPermuted number: %d\nChanged number: %d\n",
                    result[0], result[1], result[2], result[3]);
            } else {
                System.out.println("result is null");
            }

        }

        {
            Pair<Long, Long> result = Task6.solve(0, 1);
            System.out.println("\nResult of Task6:");

            if (result != null) {
                System.out.printf("Integer overflows with n=%d\n", result.getFirst());
                System.out.printf("Long overflows with n=%d\n", result.getSecond());
            }
            else {
                System.out.println("Wrong arithmetic progression, a1 must be non-negative and d must be positive");
            }

        }

        System.out.println("\nResult of Task7:");
        System.out.println(Task7.solve(999.777));

        {
            System.out.println("\nResult of Task8:");
            List<Pair<Double, Double>> result = Task8.solve(0.0, 2.0, 1.0, 0.5);
            for (Pair<Double, Double> pair : result) {
                System.out.printf("y(%f) = %f\n", pair.getFirst(), pair.getSecond());
            }

        }

        System.out.println("\nResult of Task9:");
        System.out.println(Task9.solve(10));


        System.out.println("\nResult of Task10:");
        System.out.println("Enter a sequence of non-zero integers, ending with 0");
        System.out.println(Task10.solve());
    }
}
