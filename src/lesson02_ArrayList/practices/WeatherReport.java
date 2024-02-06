package lesson02_ArrayList.practices;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WeatherReport {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        ArrayList<Double> curTemp = new ArrayList<>(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));
        Collections.sort(curTemp);
        ArrayList<Double> extreme4 = new ArrayList<>(Arrays.asList(curTemp.get(0),curTemp.get(1),curTemp.get(curTemp.size()-1),curTemp.get(curTemp.size()-2)));
        curTemp.removeAll(extreme4);

        double sum = 0 ;
        for (Double eachTemp : curTemp) {
            sum += eachTemp;
        }
        double mean = sum/curTemp.size();

        System.out.println("Max temp :"+Collections.max(curTemp));
        System.out.println("Min temp :"+Collections.min(curTemp));
        System.out.println("Median temp :"+curTemp.get(curTemp.size()/2));
        System.out.println("Mean temp :"+df.format(mean));
        System.out.println("Prediction :"+(int)(mean-5)+" - "+(int)(mean+5));
    }
}
/*
T5WeatherReport [ArrayList, loop, operators]

Create a program that will define an ArrayList of recent temperatures. There is always extreme temperatures so to get a better reading of the data remove the highest 2 and lowest 2 temperatures. Then give the following information based on the temperature:

max temperature, min temperature, median (middle temperature), mean (average temperature)

lso, give a prediction temperature range for the next few days by using the average and both adding and subtracting 5 to create the range. The values for this predication can be whole numbers

we can assume the amount of data will always be an odd number so there will be one median

    Ex:
    input:
    62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5

    // excluded: 42.3, 43.0, 68.9, 77.3
    // data sample: 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1

    output:
    max: 62.1
    min: 44.8
    median: 53.4
    mean: 52.44
    predication: 47 - 57

 */

