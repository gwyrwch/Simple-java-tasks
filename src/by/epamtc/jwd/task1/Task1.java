package by.epamtc.jwd.task1;

public class Task1 {
    private static double solve(double a, double b, double c) {
        if (a == 0 || b == 0)
            return Double.POSITIVE_INFINITY;
        return (b + Math.sqrt(b * b + 4.0 * a * c)) / (2.0 * a) - Math.pow(a, 3) * c + Math.pow(b, -2.0);
    }

    public static void main(String[] args) {
        double a = 1.0d;
        double b = 2.0d;
        double c = 3.0d;

        System.out.printf("Result of Task1: %f", solve(a, b, c));
    }
}
