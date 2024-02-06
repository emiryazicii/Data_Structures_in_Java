package lesson02_ArrayList.practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountryNames {

    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Saudi Arabia","United Arab Emirates","Israel","Palestine","Lebanon","Jordan"));
        countryNames.removeIf(country-> country.length() >= 10);
        System.out.println(countryNames);
    }
}
/*
6. Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater

 */

