package lesson02_ArrayList.practices;

import java.util.ArrayList;
import java.util.Arrays;

public class StarWarsFactions {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"));

        ArrayList<String> jediOrder = new ArrayList<>();
        ArrayList<String> galacticEmpire = new ArrayList<>();
        ArrayList<String> rebelAlliance = new ArrayList<>();

        for (String eachName : names) {
            eachName = eachName.toLowerCase();

            if (eachName.contains("jedi")){
                jediOrder.add(eachName);
            } else if (eachName.contains("imperial")|| eachName.contains("trooper") || eachName.contains("officer")) {
                galacticEmpire.add(eachName);
            } else if (eachName.contains("rebel") || eachName.contains("alliance")) {
                rebelAlliance.add(eachName);
            }
        }
        System.out.println("Jedi Order = " + jediOrder);
        System.out.println("Galactic Empire = " + galacticEmpire);
        System.out.println("Rebel Alliance = " + rebelAlliance);
    }
}
/*
T4StarWarsFactions [ArrayList, String, Loop]

Create a program that defines an ArrayList with names. Go through the names and separate them into separate ArrayLists based on the faction they belong to. Print all the factions at the end

The factions can be determined by key titles in the names
ignore case sensitivity

titles - & - related factions

jedi - jedi order
imperial, trooper, or officer - galactic empire
rebel, or alliance - rebel alliance

Sample data: Add more data if you want - note: these are just names with a title in them

"Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"

 */

