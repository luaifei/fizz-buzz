package com.thoughtworks;

public class FuzzBuzz {
    public String report(int num) {
        String result = "";
        if (num % 3 == 0 && !isContains(num, "5")) {
            result += "Fizz";
        }
        if (num % 5 == 0) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if (isContains(num, "3") && !isContains(num, "5")) {
            result = "Fizz";
        }
        return result.isEmpty() ? String.valueOf(num) : result;
    }

    public boolean isContains(int num, String str) {
        return String.valueOf(num).contains(str);
    }
}
