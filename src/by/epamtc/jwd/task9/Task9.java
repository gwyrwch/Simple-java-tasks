package by.epamtc.jwd.task9;

public class Task9 {
    private static long findProgressionSum(int n) {
        return (long)n * (n + 1) / 2;
    }

    private static long solve(int n) {
        long res = 1;

        for (int i = 2; i <= n; ++i) {
            res = res * findProgressionSum(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.printf("\nResult of Task9: %d", solve(n));
    }

}
