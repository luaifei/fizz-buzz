package com.thoughtworks;

public class FizzBuzz {
    public String report(int number) {
        String numStr = String.valueOf(number);
        if (numStr.contains("5")) {
            return handle7(number, handle5(number, ""));
        }
        if (numStr.contains("3")) {
            return "Fizz";
        }
        return handle7(number, handle5(number, handle3(number, "")));
    }

    private String handle3(int number, String preStr) {
        if (number % 3 == 0) {
            return preStr + "Fizz";
        }

        return preStr;
    }

    private String handle5(int number, String preStr) {
        if (number % 5 == 0) {
            return preStr + "Buzz";
        }

        return preStr;
    }

    private String handle7(int number, String preStr) {
        if (number % 7 == 0) {
            return preStr + "Whizz";
        }

        return preStr;
    }
}
