package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void should_say_current_number_when_reported_figure_is_multiple_of_1_and_2 () {
        assertEquals("1", FizzBuzz.getReportedFigure(1));
        assertEquals("2", FizzBuzz.getReportedFigure(2));
    }

    @Test
    void should_say_fizz_when_reported_figure_is_multiple_of_3 () {
        assertEquals("Fizz", FizzBuzz.getReportedFigure(3));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(6));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(9));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(15));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(21));
    }
}
