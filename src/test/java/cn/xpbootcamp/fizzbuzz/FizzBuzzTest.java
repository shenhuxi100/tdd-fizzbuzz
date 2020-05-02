package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_say_current_number_when_reported_figure_is_multiple_of_1_and_2 () {
        assertEquals("1", FizzBuzz.getReportedFigure(1));
        assertEquals("2", FizzBuzz.getReportedFigure(2));
    }

    @Test
    void should_say_Fizz_when_reported_figure_is_multiple_of_3 () {
        assertEquals("Fizz", FizzBuzz.getReportedFigure(3));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(6));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(9));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(21));
    }

    @Test
    void should_say_Buzz_when_reported_figure_is_multiple_of_5 () {
        assertEquals("Buzz", FizzBuzz.getReportedFigure(5));
        assertEquals("Buzz", FizzBuzz.getReportedFigure(10));
        assertEquals("Buzz", FizzBuzz.getReportedFigure(20));
        assertEquals("Buzz", FizzBuzz.getReportedFigure(35));
    }

    @Test
    void should_say_FizzBuzz_when_reported_figure_is_multiple_of_3_and_5 () {
        assertEquals("FizzBuzz", FizzBuzz.getReportedFigure(15));
        assertEquals("FizzBuzz", FizzBuzz.getReportedFigure(30));
    }

    @Test
    void should_say_Whizz_when_reported_figure_is_multiple_of_7 () {
        assertEquals("Whizz", FizzBuzz.getReportedFigure(7));
        assertEquals("Whizz", FizzBuzz.getReportedFigure(14));
        assertEquals("Whizz", FizzBuzz.getReportedFigure(28));
    }
}
