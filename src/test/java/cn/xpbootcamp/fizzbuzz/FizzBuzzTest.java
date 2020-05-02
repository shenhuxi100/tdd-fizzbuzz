package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void should_say_current_number_when_reported_figure_is_multiple_of_1_and_2 () {
        assertEquals(1, FizzBuzz.getReportedFigure(1));
        assertEquals(2, FizzBuzz.getReportedFigure(2));
    }

}
