package lesson03_Collections;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70,80,90,100,110));

        List<Integer> [] arrayOfLists = new List[3];

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        System.out.println(Arrays.toString(arrayOfLists));

        arrayOfLists[0].set(4,50);

        System.out.println(Arrays.toString(arrayOfLists));

        Set<Integer>[] arrayOfSet = new Set[5];

        arrayOfSet[0] = new LinkedHashSet<>();
        arrayOfSet[1] = new LinkedHashSet<>();
        arrayOfSet[2] = new LinkedHashSet<>();
        arrayOfSet[3] = new LinkedHashSet<>();
        arrayOfSet[4] = new LinkedHashSet<>();

        System.out.println(Arrays.toString(arrayOfSet));

        arrayOfSet[2].addAll(Arrays.asList(1,2,3,4));

        System.out.println(Arrays.toString(arrayOfSet));
    }
}
