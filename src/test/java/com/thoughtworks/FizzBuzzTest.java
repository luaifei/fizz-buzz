package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

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
        FizzBuzz fizzBuzz = spy(FizzBuzz.class);
        when(fizzBuzz.isContains(15, "5")).thenReturn(false);
        assertEquals("FizzBuzz", fizzBuzz.report(15));
    }

    @Test
    void should_return_FizzBuzzWhizz_given_input_is_divisible_by_3_and_5_and_7() {
        FizzBuzz fizzBuzz = spy(FizzBuzz.class);
        when(fizzBuzz.isContains(105, "5")).thenReturn(false);
        assertEquals("FizzBuzzWhizz", fizzBuzz.report(105));
    }

    @Test
    void should_return_Fizz_given_input_contains_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.report(13));
    }

    @Test
    void should_return_Fizz_given_input_contains_3_and_is_divisible_by_5_and_7() {
        FizzBuzz fizzBuzz = spy(FizzBuzz.class);
        when(fizzBuzz.isContains(35, "5")).thenReturn(false);
        assertEquals("Fizz", fizzBuzz.report(35));
    }

    @Test
    void should_return_Buzz_given_input_contains_5_and_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.report(15));
    }

    @Test
    void should_return_BuzzWhizz_given_input_contains_5_and_3_and_is_divisible_by_5_and_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("BuzzWhizz", fizzBuzz.report(35));
    }

    @Test
    void should_return_Fizz_given_input_contains_7_and_5_and_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.report(375));
    }

    @Test
    void should_return_Fizz_given_input_contains_7_and_is_divisible_by_5_and_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.report(75));
    }
}
