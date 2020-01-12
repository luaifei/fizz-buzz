package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_Fizz_given_input_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.report(3));
    }

    @Test
    void should_return_Buzz_given_input_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.report(5));
    }

    @Test
    void should_return_Whizz_given_input_is_divisible_by_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Whizz", fizzBuzz.report(7));
    }

    @Test
    void should_return_string_of_number_given_input_is_not_divisible_by_3_or_5_or_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.report(1));
    }

    @Test
    void should_return_FizzBuzz_given_input_is_divisible_by_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.report(15));
    }
}
