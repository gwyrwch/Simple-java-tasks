package com.company;

public class Task7 {
    private static int getIntegerPart(double x) {
        return (int)x;
    }

    private static int getFloatPart(double x) {
        return ((int)(x * 1000)) % 1000;
    }

    public static double solve(double x) {
        int intPart = getIntegerPart(x);
        int floatPart = getFloatPart(x);

        return (double)floatPart + (double)intPart / 1000;
    }
}
