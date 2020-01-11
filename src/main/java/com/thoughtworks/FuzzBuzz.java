package com.thoughtworks;

public class FuzzBuzz {
    public String report(int num) {
        if (String.valueOf(num).contains("3")) {
            return "Fizz";
        }

        String result = reportWithAllDivideRuleEffective(num);
        if (!result.isEmpty()) {
            return result;
        }

        return String.valueOf(num);
    }

    private String reportWithAllDivideRuleEffective(int num) {
        return divide3Rule(num) + divide5Rule(num) + divide7Rule(num);
    }

    private String divide3Rule(int num) {
        return num % 3 == 0 ? "Fizz" : "";
    }

    private String divide5Rule(int num) {
        return num % 5 == 0 ? "Buzz" : "";
    }

    private String divide7Rule(int num) {
        return num % 7 == 0 ? "Whizz" : "";
    }
}
