package lesson02_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        //list.add(5.5);

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);

        list.add(2,25);

        System.out.println(list);

        System.out.println("----------------------------------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList);
        System.out.println(studentsList.size());

        String firstStudent =  studentsList.get(0);
        String lastStudent = studentsList.get(studentsList.size()-1);

        System.out.println("firstStudent = " + firstStudent);
        System.out.println("lastStudent = " + lastStudent);

    }
}
