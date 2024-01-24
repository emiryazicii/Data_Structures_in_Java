package lesson01_Array;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] number = {1,2,3,4,5,6,7,8,9,10,11};

        for (int each: number) {

            if (each % 2 != 0 ){
                System.out.println(each);
            }
        }

        System.out.println("--------------------------------------------------------------------------");

        int[] nums = {100,20,30,40,5,4,3,1,2,1000,300,500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {

            if(each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("Max is :"+max);
        System.out.println("Min is :"+min);


        System.out.println("---------------------------------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};
        int[] a3 = new int[a1.length+a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }
        for (int each : a2) {
            a3[k++] = each;
        }
        System.out.println(Arrays.toString(a3));
    }
}
