package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_Fizz_when_fizzBuzz_given_number_is_divisible_by_3() {
        int inputNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.report(inputNumber));
    }

    @Test
    void should_return_Buzz_when_fizzBuzz_given_number_is_divisible_by_5() {
        int inputNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.report(inputNumber));
    }

}
