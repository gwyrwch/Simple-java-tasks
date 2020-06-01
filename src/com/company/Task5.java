package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static int[] solve(int x) {
        if (x < 100 || x > 999) {
            return null;
        } else {
            List<Integer> digits = breakNumberIntoDigits(x);
            return new int[]{
                    sumOfDigits(digits),
                    productOfDigits(digits),
                    permute(digits),
                    addDigitToBegin(digits)
            };
        }
    }

    private static List<Integer> breakNumberIntoDigits(int x) {
        List<Integer> digits = new ArrayList<>();
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }

        return digits;
    }

    private static int productOfDigits(List<Integer> digits) {
        return digits.stream().mapToInt(i->i).reduce((left, right) -> left * right).getAsInt();
    }

    private static int sumOfDigits(List<Integer> digits) {
        return digits.stream().mapToInt(i->i).sum();
    }

    private static int permute(List<Integer> digits) {
        return digits.get(0) + digits.get(1) * 100 + digits.get(2) * 10;
    }

    private static int addDigitToBegin(List<Integer> digits) {
        return digits.get(0) + digits.get(1) * 10 + digits.get(2) * 100 + digits.get(0) * 1000;
    }
}
