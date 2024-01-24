package lesson02_ArrayList;

public class WrapperClassesMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str+1);
        // Integer num1 = Integer.parseInt(str); // unboxing

        int num = Integer.parseInt(str);
        System.out.println(num+1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("----------------------------------------------------------------------");


        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("----------------------------------------------------------------------");

        String x = "true";

        boolean x1 = Boolean.parseBoolean(x);
        Boolean x2 = Boolean.valueOf(x);

        System.out.println(x1);
        System.out.println(x2);

        System.out.println("--------------------------------------------------------------------------");

        char ch = '@';

        boolean isDigit = Character.isDigit(ch);

        System.out.println("isDigit = " + isDigit);

        boolean isLetter = Character.isLetter(ch);

        System.out.println("isLetter = " + isLetter);

        boolean isLower = Character.isLowerCase(ch);

        System.out.println("isLower = " + isLower);

        boolean isUpper = Character.isUpperCase(ch);

        System.out.println("isUpper = " + isUpper);

        boolean isSpecial = !Character.isLetterOrDigit(ch); // special character

        System.out.println("isSpecial = " + isSpecial);

        System.out.println("----------------------------------------------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        char[] array = string.toCharArray();

        for (char each : array) {
            if (Character.isDigit(each))
                sum += Integer.parseInt(each+"");
        }
        System.out.println(sum);
    }
}
