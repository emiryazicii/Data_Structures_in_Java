package lesson01_Array;

public class Test {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};
        boolean has80 = ArrayUtils.isContained(numbers, 80);

        System.out.println(has80);

        System.out.println("-----------------------------------------");

        String[] students = {"Sumeye", "Hamza", "Marika"};

        System.out.println(ArrayUtils.isContained(students, "Bekir"));

    }
}
