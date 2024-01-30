package lesson04_Maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2023, 1, 15));
        person1.put("married", true);

        System.out.println(person1);

        System.out.println("------------------------------------------------------------------------");

        Map<String, Object> person2 = new LinkedHashMap<>();

        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2024, 8, 15));
        person2.put("married", true);

        System.out.println(person2.get("name"));

        System.out.println(person2.get("job_title"));

        System.out.println("--------------------------------------------------------------------------");

        List<Map<String, Object>> listOfMap = new ArrayList<>();


        Map<String, Object> person3 = new LinkedHashMap<>();

        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 34);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 120000);
        person3.put("hired_date", LocalDate.of(2024, 1, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();

        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 35);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 130000);
        person4.put("hired_date", LocalDate.of(2021, 1, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();

        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 36);
        person5.put("job_title", "Developer");
        person5.put("salary", 140000);
        person5.put("hired_date", LocalDate.of(2024, 1, 15));
        person5.put("married", true);

        listOfMap.addAll(Arrays.asList(person3, person4, person5));

        listOfMap.add(person1);
        listOfMap.add(person2);

        System.out.println(listOfMap);

        System.out.println(listOfMap.size());

        System.out.println("------------------------------------------------------------------");

        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }

        System.out.println("----------------------------------------------------------------------");

        // Display the names of the employee who are hired this year.(2024)

        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("hired_date")) {
                    if (((LocalDate) eachEntry.getValue()).getYear() == 2024) {
                        System.out.println(eachMap.get("name"));
                    }
                }
            }
        }

        System.out.println("----------------------------------------------------------------------");

        listOfMap.get(0).replace("name", "Vasyl");

        listOfMap.get(listOfMap.size() - 1).replace("salary", ((Integer) listOfMap.get(listOfMap.size() - 1).get("salary")) + 50000);

        listOfMap.get(1).replace("age", ((Integer) listOfMap.get(1).get("age")) + 4);

        System.out.println(listOfMap);


    }
}