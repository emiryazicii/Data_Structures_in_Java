package lesson02_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        groceriesList.remove(0);

        System.out.println(groceriesList);

        boolean isRemoved = groceriesList.remove("Paper Towels");

        System.out.println(isRemoved);
        System.out.println(groceriesList);

        System.out.println("--------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        boolean r1 = numbers.remove(Integer.valueOf(20));

        System.out.println(r1);
        System.out.println(numbers);

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("------------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        int i = names.indexOf("Sumeye");
        System.out.println(i);

        int b = names.lastIndexOf("Sumeye");
        System.out.println(b);

        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true

        System.out.println(hasMuhtar);
        System.out.println(hasAli);

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println(n1.equals(n2));
        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());
    }
}
