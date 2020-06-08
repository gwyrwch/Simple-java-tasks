package by.epamtc.jwd.task4;

public class Task4 {
    public static double solve(double x) {
        if (x > 13d) {
            return -3d / (x + 1);
        }

        return -Math.pow(x, 3d) + 9d;
    }

    public static void main(String[] args) {
        double x = -1d;

        System.out.printf("Result of Task4: %f", solve(x));
    }
}
