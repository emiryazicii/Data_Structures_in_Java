package lesson02_ArrayList.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5));
        list.removeIf(p -> Collections.frequency(list,p) != 1);
        System.out.println(list);
    }
}
/*
1. Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops


 */

