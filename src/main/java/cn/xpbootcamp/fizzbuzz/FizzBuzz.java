package cn.xpbootcamp.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private static Map<Integer, String> fizzBuzzWhizzMap = new HashMap();

    static {
        fizzBuzzWhizzMap.put(3, "Fizz");
        fizzBuzzWhizzMap.put(5, "Buzz");
        fizzBuzzWhizzMap.put(7, "Whizz");
    }

    public static String getReportedFigure(int number) {
        String reportFigure = "";
        String numberStr = String.valueOf(number);
        boolean isContains3 = numberStr.contains("3");
        boolean isContains5 = numberStr.contains("5");
        boolean isContains7 = numberStr.contains("7");

        if(isContains3 && !isContains5)
            return fizzBuzzWhizzMap.get(3);

        if(number % 3 == 0 && (!isContains5 || isContains7))
            reportFigure = fizzBuzzWhizzMap.get(3);
        if(number % 5 == 0 && !isContains7)
            reportFigure = reportFigure + fizzBuzzWhizzMap.get(5);
        if(number % 7 == 0)
            reportFigure = reportFigure + fizzBuzzWhizzMap.get(7);

        return reportFigure.isEmpty() ? String.valueOf(number) : reportFigure;
    }
}
