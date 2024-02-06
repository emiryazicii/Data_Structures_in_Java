package lesson01_Array.practices;

public class CommonElements2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,4,3,6};
        int[] arr2 = {12,8,2,4,5};

        String commonElements = "";

        for (int each : arr1) {
            for (int each2 : arr2) {

                if (each == each2 && !commonElements.contains(""+each) ){
                    commonElements += each+" ";
                }
            }
        }
        System.out.print("Common Elements : "+commonElements);
    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
         output:

              4 5

          MUST use for each loops
 */

