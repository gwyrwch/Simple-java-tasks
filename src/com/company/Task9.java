package com.company;

public class Task9 {
    public static long solve(int n) {
        long res = 1;
        for (int i = 2; i <= n; ++i) {
            res = res * progression(i);
        }
        return res;
    }

    private static long progression(int n) {
        return (long)n * (n + 1) / 2;
    }
}
