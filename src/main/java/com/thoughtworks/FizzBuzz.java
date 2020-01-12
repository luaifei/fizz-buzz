package com.thoughtworks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main (String ... args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream.range(1, 121)
                .forEach(num -> System.out.println(fizzBuzz.report(num)));
    }

    public String report(int num) {
        List<ReportRule> reportRuleList = Arrays.asList(
                new CommonRule(),
                new Contain3Rule(),
                new Contain5Rule(),
                new Contain7Rule());

        String result = reportRuleList.stream()
                        .filter(reportRule -> reportRule.isEffective(String.valueOf(num)))
                        .findFirst()
                        .map(reportRule -> reportRule.report(num))
                        .get();

        return result.isEmpty() ? String.valueOf(num) : result;
    }

}

interface ReportRule {
    boolean isEffective(String numStr);

    String report(int num);

    default String divide3Rule(int num) {
        return num % 3 == 0 ? "Fizz" : "";
    }

    default String divide5Rule(int num) {
        return num % 5 == 0 ? "Buzz" : "";
    }

    default String divide7Rule(int num) {
        return num % 7 == 0 ? "Whizz" : "";
    }
}

class CommonRule implements ReportRule {

    @Override
    public boolean isEffective(String numStr) {
        return !numStr.contains("3") && !numStr.contains("5") && !numStr.contains("7");
    }

    @Override
    public String report(int num) {
        return divide3Rule(num) + divide5Rule(num) + divide7Rule(num);
    }
}

class Contain3Rule implements ReportRule {

    @Override
    public boolean isEffective(String numStr) {
        return numStr.contains("3") &&
                (!numStr.contains("5") || numStr.contains("7"));
    }

    @Override
    public String report(int num) {
        return "Fizz";
    }
}

class Contain5Rule implements ReportRule {

    @Override
    public boolean isEffective(String numStr) {
        return numStr.contains("5") && !numStr.contains("7");
    }

    @Override
    public String report(int num) {
        return divide5Rule(num) + divide7Rule(num);
    }
}

class Contain7Rule implements ReportRule {

    @Override
    public boolean isEffective(String numStr) {
        return numStr.contains("7");
    }

    @Override
    public String report(int num) {
        return divide3Rule(num) + divide7Rule(num);
    }
}
