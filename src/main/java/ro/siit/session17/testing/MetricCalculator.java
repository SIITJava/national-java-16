package ro.siit.session17.testing;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetricCalculator {
    public static Map<String, Integer> unitWeight = new HashMap<>();

    public static String calculate(String expression){
        init();
        // 10 cm + 1 m - 10 mm
        // 10 cm +1 m -10 mm
        // mm, cm, dm, m, km
        expression = expression.replaceAll("\\+ ", "+");
        expression = expression.replaceAll("\\- ", "-");

        String [] expressionSplitted = expression.split(" ");

        String minUnit = "km";
        int totalValue = 0;
        for (int i = 0; i < expressionSplitted.length; i = i+2) {
            String valueAsString = expressionSplitted[i];
            Integer value = Integer.parseInt(valueAsString);
            String unit = expressionSplitted[i+1];

            int index = unitWeight.get(unit);
            totalValue += value * index;

            if (index < unitWeight.get(minUnit)){
                minUnit = unit;
            }
        }

        return totalValue / unitWeight.get(minUnit) + " " + minUnit;
    }

    public static String calculateRegexp(String expression){
        init();
        // 10 cm + 1 m - 10 mm
        // 10 cm +1 m -10 mm
        // mm, cm, dm, m, km
        if (expression.charAt(0) != '-' && expression.charAt(0) != '+'){
            expression = "+ " + expression;
        }
        expression += " ";
        System.out.println(expression);

        Pattern pattern = Pattern.compile("([+|-]\\s\\d+)\\s([m|c|d|m|k][m]?)");
        Matcher matcher = pattern.matcher(expression);

        String minUnit = "km";
        int totalValue = 0;

        while(matcher.find()){
            String valueAsString = matcher.group(1);
            Integer value = Integer.parseInt(valueAsString.replaceAll(" ", ""));
            String unit = matcher.group(2);

            int index = unitWeight.get(unit);
            totalValue += value * index;

            if (index < unitWeight.get(minUnit)){
                minUnit = unit;
            }
        }

        return totalValue / unitWeight.get(minUnit) + " " + minUnit;
    }

    private static void init(){
        unitWeight.put("mm", 1);
        unitWeight.put("cm", 10);
        unitWeight.put("dm", 100);
        unitWeight.put("m", 1000);
        unitWeight.put("km", 1000000);
    }

}
