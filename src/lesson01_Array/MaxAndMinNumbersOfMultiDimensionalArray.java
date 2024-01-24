package lesson01_Array;

public class MaxAndMinNumbersOfMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

        int max = array[0][0];
        int min = array[0][0];

        for (int[] eachList : array) {
            for (int elements : eachList) {
                if (elements > max){
                    max = elements;
                }
                if (elements < min){
                    min = elements;
                }
            }
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000

 */