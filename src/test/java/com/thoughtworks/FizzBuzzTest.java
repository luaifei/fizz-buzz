package com.thoughtworks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    void should_return_Whizz_when_fizzBuzz_given_number_is_divisible_by_7() {
        int inputNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.report(inputNumber));
    }

    @Test
    void should_return_FizzBuzz_when_fizzBuzz_given_number_is_divisible_by_3_and_5() {
        int inputNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.report(inputNumber));
    }

    @Test
    void should_return_FizzWhizz_when_fizzBuzz_given_number_is_divisible_by_3_and_7() {
        int inputNumber = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzWhizz", fizzBuzz.report(inputNumber));
    }

    @Test
    void should_return_BuzzWhizz_when_fizzBuzz_given_number_is_divisible_by_5_and_7() {
        int inputNumber = 140;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("BuzzWhizz", fizzBuzz.report(inputNumber));
    }

    @Test
    void should_return_FizzBuzzWhizz_when_fizzBuzz_given_number_is_divisible_by_3_and_5_and_7() {
        int inputNumber = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzzWhizz", fizzBuzz.report(inputNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 13})
    void should_return_Fizz_When_fizzBuzz_given_number_contains_3(int inputNumber) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.report(inputNumber));
    }
}
