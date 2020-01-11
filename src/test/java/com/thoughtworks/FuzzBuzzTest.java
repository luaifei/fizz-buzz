package com.thoughtworks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 2. 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是7的倍数，那么要说Whizz。
 *      - 当所报数字是3的倍数时，并且不包含5，7，则报Fizz (3)
 *      - 当所报数字是5的倍数时，并且不包含7，则报Buzz (5)
 *      - 当所报数字是7的倍数时，则报Whizz (7)
 *      - 当所报数字不是3或5或7的倍数时，并且不包括3，则报数字 (1)
 *
 * 3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
 *      - 当所报的数字是3和5的倍数时，并且不包含3，并且不包含5，并且不包含7，则报FizzBuzz (60)
 *      - 当所报的数字是3和7的倍数时，并且不包含5，则报FizzWhizz (21)
 *      - 当所报的数字是5和7的倍数时，并且不包含7，则报BuzzWhizz (35)
 *      - 当所报的数字是3和5和7的倍数时，并且不包含5，并且不包含7，则报FizzBuzzWhizz (210)
 *
 * 4. 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
 * 5. 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
 *      (可以整合成一个测试用例)
 *      - 当所报的数字包含3时，并且不包含5，并且不是3，5，7的倍数，则报Fizz (13)
 *      - 当所报的数字包含3时，并且不包含5，并且是5的倍数，则报Fizz (30)
 *      - 当所报的数字包含3时，并且不包含5，并且是7的倍数，则报Fizz (63)
 *      - 当所报的数字包含3时，并且不包含5，并且是3的倍数，则报Fizz (3)
 *      - 当所报的数字包含3时，并且不包含5，并且是3，5的倍数，则报Fizz (30)
 *      - 当所报的数字包含3时，并且不包含5，并且是3，7的倍数，则报Fizz (63)
 *      - 当所报的数字包含3时，并且不包含5，并是3，5，7的倍数，则报Fizz (2310)
 *
 * 6. 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
 *      - 当所报的数字包含5时，并且不包含7，并且不包含3，并且仅是3的倍数，则报数字 (51)
 *      - 当所报的数字包含5时，并且不包含7，并且不包含3，并且是3，5的倍数，则报Buzz (15)
 *      - 当所报的数字包含5时，并且不包含7，并且不包含3，并且是3，5，7的倍数，则报BuzzWhizz (105)
 *      - 当所报的数字包含5时，并且不包含7，并且包含3时，并且不是3，5，7的倍数，则报数字 (53)
 *      - 当所报的数字包含5时，并且不包含7，并且包含3时，并且仅是3的倍数，则报数字 (153)
 *      - 当所报的数字包含5时，并且不包含7，并且包含3时，并且是3，5的倍数，则报Buzz (135)
 *      - 当所报的数字包含5时，并且不包含7，并且包含3时，并且是3，5，7的倍数，则报BuzzWhizz (315)
 *
 * 7. 如果数字中包含了7，那么忽略规则6，并且忽略被5整除的判定，比如要报75的同学只报Fizz，其他case自己补齐。
 *      - 当所报的数字包含7时，并且包含5时，并且是3，5的倍数，则报Fizz (75)
 *      - 当所报的数字包含7时，并且包含5时，并且仅是5的倍数，则报数字 (275)
 *      - 当所报的数字包含7时，并且包含5时，并且仅是7的倍数，则报Whizz (1057)
 *      - 当所报的数字包含7时，并且包含5时，并且是3，5，7的倍数，则报FizzWhizz (1575)
 *      - 当所报的数字包含7时，并且包含5时，并且包含3，则报Fizz (735)
 */
public class FuzzBuzzTest {

    @Test
    void should_return_Fizz_when_report_given_number_is_divisible_by_3() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Fizz", fuzzBuzz.report(3));
    }

    @Test
    void should_return_Buzz_when_report_given_number_is_divisible_by_5() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Buzz", fuzzBuzz.report(5));
    }

    @Test
    void should_return_whizz_when_report_given_number_is_divisible_by_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Whizz", fuzzBuzz.report(7));
    }

    @Test
    void should_return_number_when_report_given_number_is_not_divisible_by_3_or_5_or_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("1", fuzzBuzz.report(1));
    }

    @Test
    void should_return_FuzzBuzz_when_report_given_number_is_divisible_by_3_and_5() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("FizzBuzz", fuzzBuzz.report(60));
    }

    @Test
    void should_return_FuzzBuzz_when_report_given_number_is_divisible_by_3_and_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("FizzWhizz", fuzzBuzz.report(21));
    }

    @Test
    void should_return_FuzzBuzz_when_report_given_number_is_divisible_by_5_and_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("BuzzWhizz", fuzzBuzz.report(70));
    }

    @Test
    void should_return_FuzzBuzz_when_report_given_number_is_divisible_by_3_and_5_and_7() {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("FizzBuzzWhizz", fuzzBuzz.report(210));
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 30, 63, 3, 30, 63, 2310})
    void should_return_Fizz_when_report_given_number_contains_3(int num) {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        assertEquals("Fizz", fuzzBuzz.report(num));
    }

}
