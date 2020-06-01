package com.company;

public class SuperDouble {
    private double[] numbers;
    private int size;

    public SuperDouble(double a, double b, double c) {
        this.numbers = new double[]{a, b, c};
        this.size = this.numbers.length;
    }

    public void doubleTheValues() {
        for (int i = 0; i < this.size; i++) {
            this.numbers[i] *= 2;
        }
    }

    public void replaceWithAbsoluteValues() {
        for (int i = 0; i < this.size; i++) {
            this.numbers[i] = Math.abs(this.numbers[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < this.size; i++) {
            result.append(this.numbers[i]);
            result.append(' ');
        }

        return String.valueOf(result);
    }

    public boolean isConditionFulfilled() {
        for (int i = 1; i < this.size; i++) {
            if (this.numbers[i] > this.numbers[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
