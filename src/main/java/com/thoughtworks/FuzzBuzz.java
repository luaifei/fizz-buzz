package com.thoughtworks;

import java.util.stream.IntStream;

public class FuzzBuzz {
    public static void main (String ... args) {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        IntStream.range(1, 121).forEach(num -> System.out.println(fuzzBuzz.report(num)));
    }
    public String report(int num) {
        String result = "";
        if (num % 3 == 0 && (!isContains(num, "5") || isContains(num, "7"))) {
            result += "Fizz";
        }
        if (num % 5 == 0 && !isContains(num, "7")) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if (isContains(num, "3") && (!isContains(num, "5") || isContains(num, "7"))) {
            result = "Fizz";
        }
        return result.isEmpty() ? String.valueOf(num) : result;
    }

    public boolean isContains(int num, String str) {
        return String.valueOf(num).contains(str);
    }
}
