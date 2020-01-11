package com.thoughtworks;

public class FuzzBuzz {
    public String report(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }
        return null;
    }
}
