package com.thoughtworks;

import java.util.Arrays;
import java.util.List;

public class FuzzBuzz {
    public String report(int num) {
        List<ReportRule> reportRuleList = Arrays.asList(
                new AllMappingRulesEffective(),
                new Contain3RuleEffective());

        return reportRuleList.stream()
                .filter(reportRule -> reportRule.isEffective(String.valueOf(num)))
                .findFirst()
                .map(reportRule -> reportRule.report(num))
                .orElse(String.valueOf(num));
    }

}

class MappingUtils {
    public static String divide3Rule(int num) {
        return num % 3 == 0 ? "Fizz" : "";
    }

    public static String divide5Rule(int num) {
        return num % 5 == 0 ? "Buzz" : "";
    }

    public static String divide7Rule(int num) {
        return num % 7 == 0 ? "Whizz" : "";
    }
}

interface ReportRule {
    boolean isEffective(String numStr);

    String report(int num);
}

class AllMappingRulesEffective implements ReportRule {

    @Override
    public boolean isEffective(String numStr) {
        return !numStr.contains("3") && !numStr.contains("5") && !numStr.contains("7");
    }

    @Override
    public String report(int num) {
        return MappingUtils.divide3Rule(num) + MappingUtils.divide5Rule(num) + MappingUtils.divide7Rule(num);
    }
}

class Contain3RuleEffective implements ReportRule {

    @Override
    public boolean isEffective(String numStr) {
        return numStr.contains("3") &&
                (!numStr.contains("5") ||
                        (numStr.contains("5") && numStr.contains("7"))
                );
    }

    @Override
    public String report(int num) {
        return "Fizz";
    }
}
