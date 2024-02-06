package lesson02_ArrayList.practices;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AverageProfit {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        ArrayList<Double> lastYear = new ArrayList<>(Arrays.asList(30.67, 16.34, 10.93, 5.01, 12.97, 11.73, 22.35, 33.9, 68.35));
        ArrayList<Double> currentYear = new ArrayList<>(Arrays.asList(32.24, 15.9, 11.57, 9.14, 10.42, 21.56, 14.16, 42.49, 54.5));
        ArrayList<Double> differenceInProfit = new ArrayList<>();

        double sum = 0;
        for (int i = 0; i < currentYear.size(); i++) {
            differenceInProfit.add(Double.parseDouble(decimalFormat.format(currentYear.get(i) - lastYear.get(i))));
            sum += differenceInProfit.get(i);
        }
        System.out.println("Profit changes compared to last year by departments \n"+differenceInProfit);
        System.out.println("The biggest increase in profit compared to last year : "+ Collections.max(differenceInProfit));
        System.out.println("The biggest profit loss compared to last year : "+Math.abs(Collections.min(differenceInProfit)));
        System.out.println("The average profit change compared to last year : "+decimalFormat.format(sum / differenceInProfit.size()));

    }
}
/*
ProfitCalculator [Wrapper class, ArrayList, loop, Collections]

        ArrayList<Double> lastYear = new ArrayList<>(Arrays.asList(30.67, 16.34, 10.93, 5.01, 12.97, 11.73, 22.35, 33.9, 68.35));
        ArrayList<Double> currentYear = new ArrayList<>(Arrays.asList(32.24, 15.9, 11.57, 9.14, 10.42, 21.56, 14.16, 42.49, 54.5));

    You are giving two ArrayList of Double values that represent the profits from last year and the current year. Each position (index) between the two ArrayList are related, so index 0 are the profits from one department. For example in our data the 30.67 and 32.24 were the profits from one department but over the last year and current year.
    Calculate the different in profits over these two years and store them into a new ArrayList
        for example the first difference would be 32.24 and 30.67
    Format and parse the value to only be 2 decimal points

    Then find the following:
        - what the biggest profit was
        - what the biggest lost was
        - the average profit

 */

