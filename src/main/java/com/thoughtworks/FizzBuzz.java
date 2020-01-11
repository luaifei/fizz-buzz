package com.thoughtworks;

public class FizzBuzz {
    public String report(int inputNumber) {
        if (isContains(inputNumber, "3")) {
            return "Fizz";
        }
        if (isDivisible(inputNumber, 3, 5, 7)) {
            return "FizzBuzzWhizz";
        }
        if (isDivisible(inputNumber, 3, 5)) {
            return "FizzBuzz";
        }
        if (isDivisible(inputNumber, 3, 7)) {
            return "FizzWhizz";
        }
        if (isDivisible(inputNumber, 5, 7)) {
            return "BuzzWhizz";
        }
        if (isDivisible(inputNumber, 3)) {
            return "Fizz";
        }
        if (isDivisible(inputNumber, 5)) {
            return "Buzz";
        }
        if (isDivisible(inputNumber, 7)) {
            return "Whizz";
        }
        return null;
    }

    private boolean isDivisible(int number, int ... divisors) {
        for (int divisor : divisors) {
            if (number % divisor != 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isContains(int number, String specialChar) {
        return String.valueOf(number).contains(specialChar);
    }
}
