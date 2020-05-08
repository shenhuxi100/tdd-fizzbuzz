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

    public static String getReportedFigure(int i) {
        String reportFigure = "";
        if(i % 3 == 0)
            reportFigure = fizzBuzzWhizzMap.get(3);
        if(i % 5 == 0)
            reportFigure = reportFigure + fizzBuzzWhizzMap.get(5);
        if(i % 7 == 0)
            reportFigure = reportFigure + fizzBuzzWhizzMap.get(7);

        return reportFigure.isEmpty() ? String.valueOf(i) : reportFigure;
    }
}
