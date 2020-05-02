package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public static String getReportedFigure(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";

        if (i % 3 == 0)
            return "Fizz";
        if (i % 5 == 0)
            return "Buzz";

        return String.valueOf(i);
    }
}
