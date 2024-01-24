package lesson02_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtils {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("------------------------------------------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs","Potatoes","Milk","Tomatoes","Rice","Orange","Strawberries","Blueberries","Paper Towels"));

        Collections.sort(items);

        System.out.println(items);

        Collections.reverse(items);

        System.out.println(items);

        ArrayList<String> students = new ArrayList();

        students.addAll(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));

        System.out.println(students);
        Collections.swap(students,0,1);

        System.out.println(students);

        Collections.swap(students,0,students.size()-1);

        System.out.println(students);

    }
}
