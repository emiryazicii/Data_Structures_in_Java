package lesson03_Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // accepts duplicates, keeps insertion order, it has index
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------");
        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null key

        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(null,200,null,40,null));

        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>(); // keeps insertion order, accepts null key

        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(null,200,null,40,null));

        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>(); // keeps sorted order , does not accept duplicates
/*
        String str = null;
        System.out.println(str.toLowerCase());

 */

        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        //set3.addAll(Arrays.asList(null,200,null,40,null));

        System.out.println(set3);


        System.out.println("------------------------------------------------------------------");

        String[] words = {"Java","Java","Java","Python","Python","C#","C++","Ruby","C#","C#"};


        Set<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        System.out.println(result);

        //System.out.println(result.get(1));
        /*
        for (String each : result) {
            System.out.println(each);
        }

         */


        System.out.println((new ArrayList<>(result).get(1)));

        words = result.toArray(new String[0]); // converting Set to Array

        System.out.println("Words array :"+Arrays.toString(words));

        System.out.println("-----------------------------------------------------------------------");


        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10,10,10,20,20,30,30,30,40,40,40,50,50,50,5,5,5,1,1,1,2,2,2));

        Set<Integer> n = new TreeSet<>(numbers);

        System.out.println(n);
    }
}
