package lesson01_Array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {
        // Define a double variable
        double n1 = 10.587654;

        // Create a DecimalFormat object with pattern "0.00"
        DecimalFormat df = new DecimalFormat("0.00");

        // Format the double value using the DecimalFormat object and print the result
        System.out.println(df.format(n1));
    }
}
