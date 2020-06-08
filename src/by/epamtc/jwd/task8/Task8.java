package by.epamtc.jwd.task8;

public class Task8 {
    private static final double EPS = 1e-11;

    private static double y(double x, double c) {
        if (Math.abs(x - 15) < EPS) {
            return (x + c) * 2;
        } else {
            return (x - c) + 6;
        }
    }

    public static void main(String[] args) {
        double a = 0d;
        double b = 1.5;
        double h = 0.2;
        double c = 2d;

        for (double i = a; i < b + EPS; i += h) {
            System.out.printf("y(%f) = %f\n", i, y(i, c));
        }
    }
}
