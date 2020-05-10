package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_say_current_number_when_reported_figure_is_multiple_of_1_and_2_when_reporting () {
        assertEquals("1", FizzBuzz.getReportedFigure(1));
        assertEquals("2", FizzBuzz.getReportedFigure(2));
    }

    @Test
    void should_say_Fizz_when_reported_figure_is_multiple_of_3_when_reporting () {
        assertEquals("Fizz", FizzBuzz.getReportedFigure(3));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(6));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(9));
    }

    @Test
    void should_say_Buzz_when_reported_figure_is_multiple_of_5_when_reporting () {
        assertEquals("Buzz", FizzBuzz.getReportedFigure(5));
        assertEquals("Buzz", FizzBuzz.getReportedFigure(10));
        assertEquals("Buzz", FizzBuzz.getReportedFigure(20));
    }

    @Test
    void should_say_FizzBuzz_when_reported_figure_is_multiple_of_3_and_5_when_reporting () {
        assertEquals("FizzBuzz", FizzBuzz.getReportedFigure(60));
    }

    @Test
    void should_say_Whizz_when_reported_figure_is_multiple_of_7_when_reporting () {
        assertEquals("Whizz", FizzBuzz.getReportedFigure(7));
        assertEquals("Whizz", FizzBuzz.getReportedFigure(14));
        assertEquals("Whizz", FizzBuzz.getReportedFigure(28));
    }

    @Test
    void should_say_FizzWhizz_when_reported_figure_is_multiple_of_3_and_7_when_reporting () {
        assertEquals("FizzWhizz", FizzBuzz.getReportedFigure(21));
        assertEquals("FizzWhizz", FizzBuzz.getReportedFigure(42));

    }

    @Test
    void should_say_BuzzWhizz_when_reported_figure_is_multiple_of_5_and_7_when_reporting () {
        assertEquals("BuzzWhizz", FizzBuzz.getReportedFigure(140));
    }

    @Test
    void should_say_FizzBuzzWhizz_when_reported_figure_is_multiple_of_3_5_and_7_when_reporting () {
        assertEquals("FizzBuzzWhizz", FizzBuzz.getReportedFigure(210));
    }

    @Test
    void should_say_number_given_reported_figure_is_not_multiple_of_3_5_and_7_when_reporting () {
        assertEquals("104", FizzBuzz.getReportedFigure(104));
        assertEquals("11", FizzBuzz.getReportedFigure(11));
        assertEquals("52", FizzBuzz.getReportedFigure(52));
    }

    @Test
    void should_say_Fizz_given_reported_figure_contains_3_when_reporting () {
        assertEquals("Fizz", FizzBuzz.getReportedFigure(13));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(63));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(30));
    }

    @Test
    void should_not_say_Fizz_given_reported_figure_contains_5_when_reporting () {
        assertEquals("BuzzWhizz", FizzBuzz.getReportedFigure(35));
    }

    @Test
    void should_say_Fizz_given_reported_figure_contains_7_when_reporting () {
        assertEquals("Fizz", FizzBuzz.getReportedFigure(75));
    }


    @Test
    void should_not_say_Buzz_given_reported_figure_contains_7_and_multiple_of_5_when_reporting () {
        assertEquals("Whizz", FizzBuzz.getReportedFigure(70));
    }
}
