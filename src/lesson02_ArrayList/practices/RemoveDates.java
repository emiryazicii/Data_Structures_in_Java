package lesson02_ArrayList.practices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {

    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(
                LocalDate.of(2022, 1, 1),
                LocalDate.of(2021, 3, 15),
                LocalDate.of(2020, 6, 30),
                LocalDate.of(2015, 8, 20),
                LocalDate.of(2014, 12, 5)));

        LocalDate selectedDate = LocalDate.of(2016,8,15);
        dates.removeIf(date-> date.isBefore(selectedDate));
        System.out.println("Dates after "+selectedDate.getMonth()+"-"+selectedDate.getDayOfMonth()+"-"+selectedDate.getYear()+"\n"+dates);
    }
}
/*
9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016

 */

