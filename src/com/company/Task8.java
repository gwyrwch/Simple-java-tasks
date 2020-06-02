package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    private static final double EPS = 1e-11;

    private static double y(double x, double c) {
        if (Math.abs(x - 15) < Task8.EPS) {
            return (x + c) * 2;
        } else {
            return (x - c) + 6;
        }
    }
    public static List<Pair<Double, Double>> solve(double a, double b, double c, double h) {
        List<Pair<Double, Double>> functionValues = new ArrayList<>();
        for (double i = a; i < b + Task8.EPS; i += h) {
            functionValues.add(new Pair<>(i, y(i, c)));
        }

        return functionValues;
    }
}
