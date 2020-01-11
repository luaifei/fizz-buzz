package com.thoughtworks;

public class FizzBuzz {
    public String report(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "Fizz";
        }
        if (inputNumber % 5 == 0) {
            return "Buzz";
        }
        if (inputNumber % 7 == 0) {
            return "Whizz";
        }
        return null;
    }
}
