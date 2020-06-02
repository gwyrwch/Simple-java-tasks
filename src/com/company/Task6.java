package com.company;

public class Task6 {
    private static final long MAXN = (long)8e9;

    private static long findNLargerOrLowerThan(double a1, double d, double bound, long r, Operator op) {
        long l = 1;
        while (l < r) {
            long n = l + (r - l) / 2;
            double val = a1 * n + d * n * (n - 1) / 2d;
            if (op.make(val, bound)) {
                r = n;
            } else {
                l = n + 1;
            }
        }
        return l;
    }

    private static int intCeil(int x, int y) {
        return (x + y - 1) / y;
    }

    public static Pair<Long, Long> solve(int a1, int d) {
        if (a1 == 0 && d == 0) {
            // never overflow
            return null;
        }

        Operator lt = (x, y) -> x < y;
        Operator gt = (x, y) -> x > y;

        if (a1 >= 0 && d >= 0) {
            return new Pair<>(findNLargerOrLowerThan(a1, d, Integer.MAX_VALUE, MAXN, gt), findNLargerOrLowerThan(a1, d, Long.MAX_VALUE, MAXN, gt));
        } else if (a1 <= 0 && d <= 0) {
            return new Pair<>(findNLargerOrLowerThan(a1, d, Integer.MIN_VALUE, MAXN, lt), findNLargerOrLowerThan(a1, d, Long.MIN_VALUE, MAXN, lt));
        } else if (a1 < 0 && d > 0) {
            // a=-10^9, d = 1
            //  a1 + (k-1)d > 0 -> (k-1) > -a1 / d

            int k = intCeil(-a1, d);
            // k -- first index when ak > 0
            long intOverflowIndex = findNLargerOrLowerThan(a1, d, Integer.MIN_VALUE, k, lt);
            if (intOverflowIndex == k) {
                intOverflowIndex = findNLargerOrLowerThan((double)a1 + (double)(k - 1) * d, d, Integer.MAX_VALUE, MAXN, gt);
            }

            long longOveflowIndex = findNLargerOrLowerThan(a1, d, Long.MIN_VALUE, k, lt);
            if (longOveflowIndex == k) {
                longOveflowIndex = findNLargerOrLowerThan((double)a1 + (double)(k - 1) * d, d, Long.MAX_VALUE, MAXN, gt);
            }

            return new Pair<>(intOverflowIndex, longOveflowIndex);
        } else {
            //  a1 + (k - 1) * d < 0 -> (k - 1) < a1 / -d
            int k = intCeil(a1, -d);

            long intOverflowIndex = findNLargerOrLowerThan(a1, d, Integer.MAX_VALUE, k, gt);
            if (intOverflowIndex == k) {
                intOverflowIndex = findNLargerOrLowerThan((double)a1 + (double)(k - 1) * d, d, Integer.MIN_VALUE, MAXN, lt);
            }

            long longOveflowIndex = findNLargerOrLowerThan(a1, d, Long.MAX_VALUE, k, gt);
            if (longOveflowIndex == k) {
                longOveflowIndex = findNLargerOrLowerThan((double)a1 + (double)(k - 1) * d, d, Long.MIN_VALUE, MAXN, lt);
            }

            return new Pair<>(intOverflowIndex, longOveflowIndex);
        }
    }

}

