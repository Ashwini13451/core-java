public class Refrigerator {
	  static  String brand = "LG";
       static String model = "InstaView Door-in-Door";
       static double capacityLiters = 668.0;
       static int numberOfDoors = 4;
       static boolean hasFreezer = true;
      static  boolean isSmart = true;
      static  String energyRating = "A++";
     static   String color = "Stainless Steel";
       static double price = 1499.99;


    public static void main(String[] args) {
        String brand = "LG";
        String model = "InstaView Door-in-Door";
        double capacityLiters = 668.0;
        int numberOfDoors = 4;
        boolean hasFreezer = true;
        boolean isSmart = true;
        String energyRating = "A++";
        String color = "Stainless Steel";
        double price = 1499.99;

        System.out.println("local variables");
 
        System.out.println("===== Refrigerator Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacityLiters + " liters");
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Has Freezer: " + hasFreezer);
        System.out.println("Smart Features: " + isSmart);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
		
		
		System.out.println("static variables");
 
        System.out.println("===== Refrigerator Details =====");
        System.out.println("Brand: " +Refrigerator. brand);
        System.out.println("Model: " +Refrigerator. model);
        System.out.println("Capacity: " +Refrigerator .capacityLiters + " liters");
        System.out.println("Number of Doors: " +Refrigerator. numberOfDoors);
        System.out.println("Has Freezer: " +Refrigerator. hasFreezer);
        System.out.println("Smart Features: " +Refrigerator. isSmart);
        System.out.println("Energy Rating: " +Refrigerator. energyRating);
        System.out.println("Color: " +Refrigerator. color);
        System.out.println("Price: $" +Refrigerator. price);

    }
}
