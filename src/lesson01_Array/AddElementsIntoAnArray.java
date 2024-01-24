package lesson01_Array;

import java.util.Arrays;

public class AddElementsIntoAnArray {

    public static void main(String[] args) {


        int[] array = {10,20,30,40,50,60,70,80};
        int element = 90 ;

        int[] newArray = Arrays.copyOf(array,array.length+1);
        newArray[newArray.length-1] = element;
        System.out.println(Arrays.toString(newArray));

        System.out.println("---------------------------------------------------------------");

        int[] numbers = {100,90,80,70,60};

        System.out.println(Arrays.toString(numbers));

        numbers = ArrayUtils.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));

        double[] nums = {1.5,2.5,3.5,4.5};

        nums = ArrayUtils.addElement(nums,5.5);
        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------------------------------------");

        String[] students = {"Yasin","Sumeye","Ermek"};

        students = ArrayUtils.addElement(students,"Umran");
        students = ArrayUtils.addElement(students,"Kamil");
        students = ArrayUtils.addElement(students,"Recep");

        System.out.println(Arrays.toString(students));
    }
}
