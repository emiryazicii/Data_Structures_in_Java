package lesson02_ArrayList.practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveString {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        list.removeIf(each-> String.valueOf(each.charAt(0)).equalsIgnoreCase(String.valueOf(each.charAt(each.length()-1))));
        System.out.println(list);
    }
}
/*
7. Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		[Canada, Lan, Ebrahim, Farida]

 */

