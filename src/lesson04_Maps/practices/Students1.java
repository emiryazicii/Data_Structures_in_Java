package lesson04_Maps.practices;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Students1 {

    public static void main(String[] args) {

        Map<String, int[]> scores = new LinkedHashMap<>();


        scores.put("Emir",new int[]{70,80,90,95,100});
        scores.put("Boris",new int[]{75,85,95,95,100});
        scores.put("Farhad",new int[]{65,80,95,100,100});
        scores.put("Jika",new int[]{73,88,99,95,85});
        scores.put("Nadia",new int[]{65,80,92,95,75});

        //scores.forEach((k,v) -> System.out.println(k+" : "+ Arrays.toString(v)));

        // use the get method to read from the map based on the key
        // use Arrays.toString because the value is an array

        for(String key: scores.keySet()){
            System.out.println(key + " " + Arrays.toString(scores.get(key)));
        }

    }
}
/*
Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores

 */

