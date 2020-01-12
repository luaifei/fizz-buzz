package com.thoughtworks;

public class FizzBuzz {
    public String report(int num) {
        String result = "";
        if (num % 3 == 0) {
            result += "Fizz";
        }
        if (num % 5 == 0) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if (String.valueOf(num).contains("3")) {
            result = "Fizz";
        }
        return result.isEmpty() ? String.valueOf(num) : result;
    }
}
