package lesson01_Array;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length];// to make sure that 3rd array has enough capacity to contain

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { // i: for first array's index number

            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {// i: for second array's index number

            arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};
        int[] a3 = ArrayUtils.merge(a1, a2);
        System.out.println(Arrays.toString(a3));

        System.out.println("------------------------------------------------------------");

        double[] b1 = {10.5,5.5,3.5,6.5,8.5};
        double[] b2 = {20.5,15.5,13.5};

        double[] b3 = ArrayUtils.merge(b1,b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("-------------------------------------------------------------");

        char[] c1 = {'A','b','c','D','e'};
        char[] c2 = {'X','Y','Z'};

        char[] c3 = ArrayUtils.merge(c1,c2);

        System.out.println(Arrays.toString(c3));

        System.out.println("----------------------------------------------------------------");

        String[] s1 = {"Java","Python","C++","C#"};
        String[] s2 = {"Cucumber","Selenium","Postman"};

        String[] s3 = ArrayUtils.merge(s1,s2);

        System.out.println(Arrays.toString(s3));

        System.out.println("---------------------------------------------------");

        char[] z1 = {'C','b','D','k'};

        z1 = ArrayUtils.reverse(z1);

        System.out.println(Arrays.toString(z1));

        System.out.println("-----------------------------------------------------");

        String[] l1 = {"efil","sefil","kefil","fil"};

        l1 = ArrayUtils.reverse(l1);

        System.out.println(Arrays.toString(l1));
    }
}
/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}

 */