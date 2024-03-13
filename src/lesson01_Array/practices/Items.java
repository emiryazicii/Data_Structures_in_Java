package lesson01_Array.practices;

public class Items {

    public static void main(String[] args) {
        // Arrays of items, prices, and item IDs
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        // Find the first index number of "Gloves"
        int glovesFirstIndex = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                glovesFirstIndex = i;
                break; // Once found, exit the loop
            }
        }
        System.out.println("\"Gloves\" first index number is: " + glovesFirstIndex);

        // Check if "iPad" is contained in the item list
        boolean isContain = false;
        for (String item : items) {
            if (item.equals("iPad")) {
                isContain = true;
                break; // Once found, exit the loop
            }
        }
        System.out.println("iPad is contained in the item list: " + isContain);

        // Generate the report of each shopping item
        String report = "";
        for (int i = 0; i < items.length; i++) {
            report += items[i] + " - $" + prices[i] + " - #" + itemIDs[i] + "\n";
        }
        System.out.println("Report: \n" + report);
    }
}
