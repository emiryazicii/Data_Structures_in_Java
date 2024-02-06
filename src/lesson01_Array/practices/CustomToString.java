package lesson01_Array.practices;

public class CustomToString {

    public static void main(String[] args) {

        int[][] arr = {{3, 4, 5, 6}, {5, 2, 6}, {10, 40, 20}};
        System.out.println(customToString(arr));
    }
    public static String customToString(int[][] arr) {

        String str = "";

        for (int i = 0; i < arr.length; i++) {
            str += "Index "+i+" :";
            for (int j = 0; j < arr[i].length; j++) {
                str += "<" + arr[i][j] + ">";
            }
            str+="\n";
        }
        return str;
    }
}
/*
CustomPrint [multidimensional, loop, String, method]

     Create a method that will accept a 2D int array and return a String format of the array. Make your own custom print format for this 2D array instead of using the deepToString() method

     Ex:    this is just an example. You can be creative for how the 2D array will be printed
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            index 0 | (3)(4)(5)(6)
            index 1 | (5)(2)(6)
            index 3 | (10)(40)(20)

 */

