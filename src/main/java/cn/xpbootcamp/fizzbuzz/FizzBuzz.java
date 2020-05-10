package cn.xpbootcamp.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private static HashMap<Integer, String> fizzBuzzWhizzMap = new HashMap<>();

    static {
        fizzBuzzWhizzMap.put(3, "Fizz");
        fizzBuzzWhizzMap.put(5, "Buzz");
        fizzBuzzWhizzMap.put(7, "Whizz");
    }

    public static String getReportedFigure(int number) {
        String reportFigure = "";
        String numberStr = String.valueOf(number);
        boolean isContainsThree = numberStr.contains("3");
        boolean isContainsFive = numberStr.contains("5");
        boolean isContainsSeven = numberStr.contains("7");

        if(isContainsThree && !isContainsFive)
            return fizzBuzzWhizzMap.get(3);

        if(number % 3 == 0 && (!isContainsFive || isContainsSeven))
            reportFigure = fizzBuzzWhizzMap.get(3);
        if(number % 5 == 0 && !isContainsSeven)
            reportFigure = reportFigure + fizzBuzzWhizzMap.get(5);
        if(number % 7 == 0)
            reportFigure = reportFigure + fizzBuzzWhizzMap.get(7);

        return reportFigure.isEmpty() ? String.valueOf(number) : reportFigure;
    }
}
