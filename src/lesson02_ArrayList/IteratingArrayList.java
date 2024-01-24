package lesson02_ArrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);

        //numbers.add(300,2000);

        System.out.println(numbers);

        for (Integer each : numbers) {
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i)+" ");
        }
    }
}
