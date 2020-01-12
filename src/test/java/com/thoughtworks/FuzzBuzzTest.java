package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * 1. 输入是3的倍数，返回Fizz；输入是5的倍数，返回Buzz；输入是7的倍数，返回Whizz；如果既不是3或5或7的倍数，则返回数字
 * 4. 输入同时是两个及以上的倍数，则返回组合的字母
 * 5. 如果数字包含3，则返回Fizz，并且忽略5和7的倍数关系
 * 6. 如果数字包含5，则忽略3的倍数关系和包含3的规则
 * 7. 如果数字包含7，则忽略5的倍数关系
 */
public class FuzzBuzzTest {

    @Test
    void should_return_Fizz_when_num_is_divisible_by_3() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Fizz", fuzzBuzz.report(3));
    }

    @Test
    void should_return_Buzz_when_num_is_divisible_by_5() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Buzz", fuzzBuzz.report(5));
    }

    @Test
    void should_return_Whizz_when_num_is_divisible_by_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Whizz", fuzzBuzz.report(7));
    }

    @Test
    void should_return_string_of_number_given_num_is_not_divisible_by_3_or_5_or_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("1", fuzzBuzz.report(1));
    }

    @Test
    void should_return_FizzBuzz_given_number_is_divisible_by_3_and_5() {
        FuzzBuzz fuzzBuzz = spy(FuzzBuzz.class);
        when(fuzzBuzz.isContains(15, "5")).thenReturn(false);
        assertEquals("FizzBuzz", fuzzBuzz.report(15));
    }

    @Test
    void should_return_FizzBuzzWhizz_given_number_is_divisible_by_3_and_5_and_7() {
        FuzzBuzz fuzzBuzz = spy(FuzzBuzz.class);
        when(fuzzBuzz.isContains(105, "5")).thenReturn(false);
        assertEquals("FizzBuzzWhizz", fuzzBuzz.report(105));
    }

    @Test
    void should_return_Fizz_given_number_contains_3() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Fizz", fuzzBuzz.report(13));
    }

    @Test
    void should_return_Fizz_given_number_contains_3_and_is_divisible_by_5_and_7() {
        FuzzBuzz fuzzBuzz = spy(FuzzBuzz.class);
        when(fuzzBuzz.isContains(35, "5")).thenReturn(false);
        assertEquals("Fizz", fuzzBuzz.report(35));
    }

    @Test
    void should_return_Buzz_given_number_contains_5_and_is_divisible_by_3() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Buzz", fuzzBuzz.report(15));
    }

    @Test
    void should_return_BuzzWhizz_given_number_contains_5_and_3_and_is_divisible_by_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("BuzzWhizz", fuzzBuzz.report(35));
    }

    @Test
    void should_return_Fizz_given_number_contains_7_and_5_and_is_divided_by_3() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Fizz", fuzzBuzz.report(75));
    }
}
