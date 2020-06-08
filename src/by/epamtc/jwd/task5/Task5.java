package by.epamtc.jwd.task5;

public class Task5 {
    private static boolean  isValidNumber(int number) {
        return number >= 100 && number <= 999;
    }

    private static int findSumOfDigits(int ones, int tens, int hundreds) {
        return ones + tens + hundreds;
    }

    private static int findProductOfDigits(int ones, int tens, int hundreds) {
        return ones * tens * hundreds;
    }

    private static int swapHundredsAndTens(int ones, int tens, int hundreds) {
        return tens * 100 + hundreds * 10 + ones;
    }

    private static int findFourDigitNumber(int ones, int number) {
        return ones * 1000 + number;
    }

    public static void main(String[] args) {
        int number = 137;

        if (isValidNumber(number)) {
            int ones = number % 10;
            int tens = number / 10 % 10;
            int hundreds = number / 100 % 10;

            int sumOfDigits = findSumOfDigits(ones, tens, hundreds);
            int productOfDigits = findProductOfDigits(ones, tens, hundreds);
            int numberAfterSwap = swapHundredsAndTens(ones, tens, hundreds);
            int fourDigitNumber = findFourDigitNumber(ones, number);

            System.out.println("Result of Task5:");
            System.out.printf(
                    "Sum of digits: %d\nProduct of digits: %d\nPermuted number: %d\nChanged number: %d\n",
                    sumOfDigits, productOfDigits, numberAfterSwap, fourDigitNumber);
        }  else {
            System.out.println("Number is not a three digit");
        }
    }
}
