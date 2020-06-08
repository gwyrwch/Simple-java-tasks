package by.epamtc.jwd.task6;

public class Task6 {
    private static int findWhenIntOverflows(int a1, int d) {
        if (a1 == 0 && d == 0) {
            return -1;
        }

        int sum = a1;
        int ai = a1 + d;

        for (int i = 2; ; i++, ai += d) {
            int new_sum = (a1 + ai) * i / 2;
            if (ai > 0 && new_sum < sum) {
                return i;
            }

            if (ai < 0 && new_sum > sum) {
                return i;
            }

            sum = new_sum;
        }
    }

    private static long findWhenLongOverflows(long a1, long d) {
        if (a1 == 0 && d == 0) {
            return -1;
        }

        long sum = a1;
        long ai = a1 + d;

        for (long i = 2; ; i++, ai += d) {
            long new_sum = (a1 + ai) * i / 2;
            if (ai > 0 && new_sum < sum) {
                return i;
            }

            if (ai < 0 && new_sum > sum) {
                return i;
            }

            sum = new_sum;
        }
    }

    public static void main(String[] args) {
        int a1 = -1000000000;
        int d = 1;

        int intOverflow = findWhenIntOverflows(a1, d);
        long longOverflow = findWhenLongOverflows(a1, d);

        System.out.println("\nResult of Task6:");
        if (intOverflow != -1) {
            System.out.printf("Integer overflows with n=%d\n", intOverflow);
            System.out.printf("Long overflows with n=%d\n", longOverflow);
        } else {
            System.out.println("Never overflows");
        }
    }
}
