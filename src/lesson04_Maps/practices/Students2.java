package lesson04_Maps.practices;

import java.util.LinkedHashMap;
import java.util.Map;

public class Students2 {

    public static void main(String[] args) {

        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group3 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group4 = {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

        Map<Integer, String[]> groups = new LinkedHashMap<>();

        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(3,group3);
        groups.put(4,group4);
        groups.put(5,group5);

        // Display the names of each student with group id of 1

        for (String eachName : groups.get(1)) {
            System.out.println(eachName);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        //Display the names of each student from each groups

        for (Integer eachGroup : groups.keySet()) {
            System.out.println("Group : "+eachGroup);
            for (String eachName : groups.get(eachGroup)) {
                System.out.println(eachName);
            }
        }
    }
}
/*
Given the following arrays that contains the names of the students from each group:

	    String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group3 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group4 = {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};


	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group ids and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups

 */

