package lesson04_Maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order , accepts null key & null values

        hashMap.put("Daniel",95000);
        hashMap.put("Emily",100000);
        hashMap.put("Bella",85000);
        //hashMap.put("Daniel",105000);
        hashMap.put("Aaron",73000);
        hashMap.put("Chris",null);
        hashMap.put("Breanna",null);
        hashMap.put(null,120000);
        hashMap.put(null,110000);
        hashMap.put(null,100000);

        System.out.println("hashMap = "+hashMap);

        System.out.println("-------------------------------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order , accepts null key & null values

        linkedHashMap.put("Daniel",95000);
        linkedHashMap.put("Emily",100000);
        linkedHashMap.put("Bella",85000);
        //linkedHashMap.put("Daniel",105000);
        linkedHashMap.put("Aaron",73000);
        linkedHashMap.put("Chris",null);
        linkedHashMap.put("Breanna",null);
        linkedHashMap.put(null,120000);
        linkedHashMap.put(null,110000);
        linkedHashMap.put(null,100000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("-------------------------------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order , does not accept null as a key but accepts null values

        treeMap.put("Daniel",95000);
        treeMap.put("Emily",100000);
        treeMap.put("Bella",85000);
        //treeMap.put("Daniel",105000);
        treeMap.put("Aaron",73000);
        treeMap.put("Chris",null);
        treeMap.put("Breanna",null); // value can be null
        //treeMap.put(null,120000);  // key can't  be null
        //treeMap.put(null,110000);  // key can't be null
        //treeMap.put(null,100000);  // key can't be null

        System.out.println("treeMap = " + treeMap);

        System.out.println("-------------------------------------------------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); // maintains random order , does not accept null as a key & null values ,Synchronized

        hashtable.put("Daniel",95000);
        hashtable.put("Emily",100000);
        hashtable.put("Bella",85000);
        hashtable.put("Daniel",105000);
        hashtable.put("Aaron",73000);
        //hashtable.put("Chris",null); // value can't be null
        //hashtable.put("Breanna",null); // value can't be null
        //hashtable.put(null,120000); // key can't be null
        //hashtable.put(null,110000); // key can't be null

        /*
        try {
            hashtable.put(null,100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

         */

        System.out.println("hashtable = " + hashtable);
    }
}
/*
pair : name = salary

  Daniel = 95000
  Emily = 100000
  Bella = 85000

 */