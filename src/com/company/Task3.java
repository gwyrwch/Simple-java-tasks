package com.company;

public class Task3 {
    public static void solve(SuperDouble number) {
        if (number.isConditionFulfilled()) {
            number.doubleTheValues();
        } else {
            number.replaceWithAbsoluteValues();
        }
    }
}
