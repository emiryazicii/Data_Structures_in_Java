package lesson02_ArrayList;

import java.util.ArrayList;

public class UniqueElementsInArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shakir");
        names.add("Marika");
        names.add("Marika");

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.print(each+" ");
                // break;
            }
        }
    }
}
