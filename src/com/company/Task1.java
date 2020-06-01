package com.company;

public class Task1 {
    public static double solve(double a, double b, double c) {
        return firstArg(a, b, c) - secondArg(a, c) - thirdArg(b);
    }

    private static double firstArg(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4d * a * c)) / (2d * a);
    }

    private static double secondArg(double a, double c) {
        return Math.pow(a, 3d) * c ;
    }

    private static double thirdArg(double b) {
        return Math.pow(b, -2d);
    }


}
