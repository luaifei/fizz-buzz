package com.thoughtworks;

public class FuzzBuzz {
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
        return result.isEmpty() ? String.valueOf(num) : result;
    }
}
