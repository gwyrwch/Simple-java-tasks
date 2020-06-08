package by.epamtc.jwd.task2;

public class Task2 {
    private static Pair<Integer, Integer> solve(int day) {
        for (int month = 1; month <= 12; month++) {
            int daysInMonth = 0;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    daysInMonth = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
            }

            if (day <= daysInMonth) {
                return new Pair<>(month, day);
            }

            day -= daysInMonth;
        }

        return null;
    }

    public static void main(String[] args) {
        int dayNumber = 100;

        Pair<Integer, Integer> result = solve(dayNumber);
        if (result != null) {
            System.out.printf("Result of Task2:\nMonth: %d, Day: %d\n", result.getFirst(), result.getSecond());
        } else {
            System.out.println("Invalid input data");
        }
    }
}
