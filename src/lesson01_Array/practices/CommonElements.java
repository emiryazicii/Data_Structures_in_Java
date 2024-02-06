package lesson01_Array.practices;

public class CommonElements {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,5,6};
        int[] arr2 = {4,5,6,7,8,6,4};

        String temp = "";

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j] && !temp.contains(""+arr1[i])){

                    temp += arr1[i]+" ";
                }
            }
        }
        System.out.println(temp);
    }
}
/*
 Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */

