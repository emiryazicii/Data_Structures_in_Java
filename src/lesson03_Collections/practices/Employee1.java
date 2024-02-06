package lesson03_Collections.practices;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee1 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        // who has the maximum and minimum salary?

        int max = Integer.MIN_VALUE,
                min = Integer.MAX_VALUE;

        String maxName = null,
                minName = null;

        for (String eachKey : map.keySet()) {
            int value = map.get(eachKey);

            if(value > max){
                max = value;
                maxName = eachKey;
            }

            if(value < min){
                min = value;
                minName = eachKey;
            }
        }

        System.out.println("maxName = " + maxName);
        System.out.println("minName = " + minName);

        System.out.println("----------------------------------------------------------------");

        //how many employees has the salary between 120k ~ 150K?

        int count = 0;

        for (Integer value : map.values()) {
            if(value <= 150000 && value >= 120000){
                count++;
            }
        }

        System.out.println(count+" employee gets the salary between 120K ~ 150K");

        System.out.println("--------------------------------------------------------------------");

        //display the names of the employees who are making less than 118k?

        System.out.println("Employees making less than 118K");

        for (String eachKey : map.keySet()) {
            int value = map.get(eachKey);

            if(value < 118000){
                System.out.println(eachKey);
            }
        }

        System.out.println("-----------------------------------------------------------------");

        //increase the salary employee by 10K if the current salary of employee is less than 120K

        for (String eachKey : map.keySet()) {
            int value = map.get(eachKey);

            if(value < 120000){
                map.replace(eachKey,map.get(eachKey) + 10000);
            }
        }
        System.out.println(map);
    }
}
/*
 Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

 */

