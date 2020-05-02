package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public static String getReportedFigure(int i) {
        if (i % 3 == 0)
            return "Fizz";
        return String.valueOf(i);
    }
}
