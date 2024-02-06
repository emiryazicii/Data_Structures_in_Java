package lesson04_Maps.practices;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Car {

    public static void main(String[] args) {

        Map<String, Object> car1 = new Hashtable<>();

        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();

        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();

        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        //(Create 3 more map objects and store 3 different car information in them)

        Map<String, Object> car4 = new Hashtable<>();

        car4.put("brand", "Mercedes");
        car4.put("model", "CLS");
        car4.put("color", "White");
        car4.put("year", 2024);
        car4.put("price", 75000);
        car4.put("electric", false);

        Map<String, Object> car5 = new Hashtable<>();

        car5.put("brand", "Honda");
        car5.put("model", "Accord");
        car5.put("color", "Black");
        car5.put("year", 2023);
        car5.put("price", 28000);
        car5.put("electric", false);

        Map<String, Object> car6 = new Hashtable<>();

        car6.put("brand", "Toyota");
        car6.put("model", "Camry");
        car6.put("color", "Blue");
        car6.put("year", 2021);
        car6.put("price", 25000);
        car6.put("electric", false);

        //Create a map named myCars that takes car number as a key and car info as a value
        //        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

        Map<Integer, Map<String, Object>> myCars = new LinkedHashMap();

        myCars.put(1,car1);
        myCars.put(2,car2);
        myCars.put(3,car3);
        myCars.put(4,car4);
        myCars.put(5,car5);
        myCars.put(6,car6);

        // Display the brand-model-price of each car

        for (Map<String, Object> eachCar : myCars.values()) {
            System.out.println("Brand : "+eachCar.get("brand"));
            System.out.println("Model : "+eachCar.get("model"));
            System.out.println("Price : $"+eachCar.get("price"));
            System.out.println("--------------------------");
        }

        // Display all the electric cars

        for (Map<String, Object> eachCar : myCars.values()) {
            if(eachCar.get("electric").equals(true)){
                System.out.println("Brand : "+eachCar.get("brand"));
                System.out.println("Model : "+eachCar.get("model"));
                System.out.println("--------------------------");
            }
        }

        //Display the most expensive car

        int max = Integer.MIN_VALUE;
        String maxCar = null;

        for (Map<String, Object> eachCar : myCars.values()) {
            int price = (Integer)eachCar.get("price");
            if(price> max){
                max = price;
                maxCar = ((String) eachCar.get("brand"));
            }
        }
        System.out.println("The most expensive car : "+maxCar);
    }
}
/*
Given the following maps that contains the different car information:

		 Map<String, Object> car1 = new Hashtable<>();
	        car1.put("brand", "BMW");
	        car1.put("model", "X5");
	        car1.put("color", "Red");
	        car1.put("year", 2021);
	        car1.put("price", 55000);
	        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
	        car2.put("brand", "Audi");
	        car2.put("model", "Q7");
	        car2.put("color", "Gray");
	        car2.put("year", 2022);
	        car2.put("price", 50000);
	        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
	        car3.put("brand", "Tesla");
	        car3.put("model", "Model Y");
	        car3.put("color", "White");
	        car3.put("year", 2020);
	        car3.put("price", 60000);
	        car3.put("electric", true);

        (Create 3 more map objects and store 3 different car information in them)

        4.1 Create a map named myCars that takes car number as a key and car info as a value
        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

		4.2 Display the brand-model-price of each car

		4.3 Display all the electric cars

		4.4 Display the most expensive car


 */

