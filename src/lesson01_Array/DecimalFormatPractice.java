package lesson01_Array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

        double n1 = 10.587654;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(n1));
    }
}
