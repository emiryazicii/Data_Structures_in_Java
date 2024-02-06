package lesson01_Array.practices;

public class Items {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int glovesFirstIndex = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")){
                glovesFirstIndex = i;
            }
        }
        System.out.println("\"Gloves\" first index number is: "+glovesFirstIndex);

        boolean isContain = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("iPad")){
                isContain = true;
            }
        }
        System.out.println("iPad is contained in the item list: "+ isContain);

        String report = "";
        for (int i = 0; i < items.length; i++) {

            report += (items[i]+" - "+prices[i]+" - "+itemIDs[i])+"\n";
        }
        System.out.println("Report : \n"+report);
    }
}

/*
 Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */

