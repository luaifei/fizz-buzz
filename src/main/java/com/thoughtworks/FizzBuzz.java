package com.thoughtworks;

public class FizzBuzz {
    public String report(int number) {
        String numStr = String.valueOf(number);
        if (numStr.contains("7")) {
            return handle7(number, handle3(number, ""));
        }
        if (numStr.contains("5")) {
            return handle7(number, handle5(number, ""));
        }
        if (numStr.contains("3")) {
            return "Fizz";
        }
        return handleOther(number, handle7(number, handle5(number, handle3(number, ""))));
    }

    private String handle3(int number, String preStr) {
        return number % 3 == 0 ? preStr + "Fizz" : preStr;
    }

    private String handle5(int number, String preStr) {
        return number % 5 == 0 ? preStr + "Buzz" : preStr;
    }

    private String handle7(int number, String preStr) {
        return number % 7 == 0 ? preStr + "Whizz" : preStr;
    }

    private String handleOther(int number, String preStr) {
        return preStr.isEmpty() ? String.valueOf(number) : preStr;
    }
}
