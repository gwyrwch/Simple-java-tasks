package com.company;

import java.util.List;

public class Main {
    private static void solveTask1() {
        double a = 0d;
        double b = 1d;
        double c = 1d;

        System.out.println("Result of Task1:");
        System.out.println(Task1.solve(a, b, c));
    }

    private static void solveTask2() {
        int year = 2020;
        int dayNumber = 100;

        Pair<String, Integer> result = Task2.solve(year, dayNumber);
        System.out.println("\nResult of Task2:");
        if (result != null) {
            System.out.printf("Month: %s, Day: %d\n", result.getFirst(), result.getSecond());
        } else {
            System.out.println("Invalid input data");
        }

    }

    private static void solveTask3() {
        double a = -5d;
        double b = 4d;
        double c = 3d;

        SuperDouble doubleValues = new SuperDouble(a, b, c);
        Task3.solve(doubleValues);

        System.out.println("\nResult of Task3:");
        System.out.printf("Initial numbers: %f %f %f\n", a, b, c);
        System.out.println("Numbers after conversion: " + doubleValues);
    }

    private static void solveTask4() {
        double x = -1d;
        System.out.println("\nResult of Task4:");
        System.out.println(Task4.solve(x));
    }

    private static void solveTask5() {
        int x = 123;
        int[] result = Task5.solve(x);

        System.out.println("\nResult of Task5:");
        if (result != null) {
            System.out.printf(
                    "Sum of digits: %d\nProduct of digits: %d\nPermuted number: %d\nChanged number: %d\n",
                    result[0], result[1], result[2], result[3]);
        } else {
            System.out.println("result is null");
        }
    }

    private static void solveTask6() {
        int a1 = 0;
        int d = 1;
        Pair<Long, Long> result = Task6.solve(a1, d);

        System.out.println("\nResult of Task6:");
        if (result != null) {
            System.out.printf("Integer overflows with n=%d\n", result.getFirst());
            System.out.printf("Long overflows with n=%d\n", result.getSecond());
        }
        else {
            System.out.println("Wrong arithmetic progression, a1 must be non-negative and d must be positive");
        }
    }

    private static void solveTask7() {
        double x =  999.777;

        System.out.println("\nResult of Task7:");
        System.out.println(Task7.solve(x));
    }

    private static void solveTask8() {
        double a = 0d;
        double b = 20d;
        double c = 1d;
        double h = 1.5d;

        System.out.println("\nResult of Task8:");
        List<Pair<Double, Double>> result = Task8.solve(a, b, c, h);
        for (Pair<Double, Double> pair : result) {
            System.out.printf("y(%f) = %f\n", pair.getFirst(), pair.getSecond());
        }
    }

    private static void solveTask9() {
        int n = 10;

        System.out.println("\nResult of Task9:");
        System.out.println(Task9.solve(n));
    }

    private static void solveTask10() {
        System.out.println("\nResult of Task10:");
        System.out.println("Enter a sequence of non-zero integers, ending with 0");
        System.out.println(Task10.solve());
    }

    public static void main(String[] args) {
        solveTask1();
        solveTask2();
        solveTask3();
        solveTask4();
        solveTask5();
        solveTask6();
        solveTask7();
        solveTask8();
        solveTask9();
        solveTask10();
    }
}
