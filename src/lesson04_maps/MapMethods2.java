package lesson04_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods2 {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02","Josh");
        map.put("B03","Nora");
        map.put("A02","Khashayar");
        map.put("D02","Abidullah");
        map.put("A03","Tatiana");

        Map<String, String> employees = new TreeMap<>();

        employees.putAll(map);

        System.out.println(employees);

        System.out.println(map == employees); // comparing two different object

        System.out.println(map.equals(employees)); // comparing all pairs
    }
}
