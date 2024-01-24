package lesson02_ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(),new Person(), new Person(),new Person(),new Person(),};
        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Aaron",'M', LocalDate.of(1975,12,14));
        people[2].setInfo("Zack",'M', LocalDate.of(1963,7,2));
        people[3].setInfo("Alisa",'F', LocalDate.of(1988,6,18));
        people[4].setInfo("Melisa",'F', LocalDate.of(1993,11,29));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        for (Person person : studentsList) {
            System.out.println("Name : "+person.name + ", Date of Birth : "+ person.dateOfBirth);
        }
        studentsList.removeIf(person -> person.age > 55);
        System.out.println("Names of people younger than 55 : ");
        for (Person person : studentsList) {
            System.out.println(person.name);
        }
    }
}
/*
print name and date of birth of each person objects
remove all the person object that has age > 55
 */