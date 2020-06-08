package by.epamtc.jwd.task3;

public class Task3 {
    private static void solve(DoubleRef a, DoubleRef b, DoubleRef c) {
        double aValue = a.getValue();
        double bValue = b.getValue();
        double cValue = c.getValue();

        if (aValue > bValue && bValue > cValue) {
            a.setValue(aValue * 2);
            b.setValue(bValue * 2);
            c.setValue(cValue * 2);
        } else {
            a.setValue(Math.abs(aValue));
            b.setValue(Math.abs(bValue));
            c.setValue(Math.abs(cValue));
        }
    }

    public static void main(String[] args) {
        DoubleRef a = new DoubleRef(-5d);
        DoubleRef b = new DoubleRef(4d);
        DoubleRef c = new DoubleRef(3d);

        solve(a, b, c);
        System.out.printf("Result of Task3: %f %f %f\n", a.getValue(), b.getValue(), c.getValue());
    }
}
