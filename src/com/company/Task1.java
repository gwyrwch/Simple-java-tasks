package com.company;

public class Task1 {
    public static double solve(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4.0 * a * c)) / (2.0 * a) - Math.pow(a, 3) * c - Math.pow(b, -2.0);
    }
}
