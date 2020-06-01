package com.company;

public class Task4 {
    private static double f1(double x) {
        return -Math.pow(x, 3d) + 9d;
    }

    private static double f2(double x) {
        return -3d / (x + 1);
    }

    private static double f(double x) {
        if (x > 13d) {
            return f2(x);
        } else {
            return f1(x);
        }
    }

    public static double solve(double x) {
        return f(x);
    }
}
