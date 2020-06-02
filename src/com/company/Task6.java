package com.company;

public class Task6 {
    private static final long INF = (long)8e9;

    private static long findNLargerThan(double a1, double d, double maxValue) {
        long l = 1, r = Task6.INF;
        while (l < r) {
            long n = l + (r - l) / 2;
            double val = a1 * n + d * n * (n - 1) / 2d;
            if (val > maxValue) {
                r = n;
            } else {
                l = n + 1;
            }
        }
        return l;
    }

    public static Pair<Long, Long> solve(int a1, int d) {
        if (a1 < 0 || d <= 0) {
            return null;
        }

        return new Pair<>(findNLargerThan(a1, d, Integer.MAX_VALUE), findNLargerThan(a1, d, Long.MAX_VALUE));
    }



}

