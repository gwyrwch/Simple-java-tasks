package by.epamtc.jwd.task7;

public class Task7 {
    private static int getIntegerPart(double x) {
        return (int)x;
    }

    private static int getFloatPart(double x) {
        return ((int)(x * 1000)) % 1000;
    }

    private static double solve(double x) {
        int intPart = getIntegerPart(x);
        int floatPart = getFloatPart(x);

        return (double)floatPart + (double)intPart / 1000;
    }

    public static void main(String[] args) {
        double x =  999.777;

        System.out.printf("Result of Task7: %.3f\n", solve(x));
    }
}
