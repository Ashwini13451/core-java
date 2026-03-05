class Dairymilk {       
      static  String brand = "Cadbury";
      static  String productName = "Dairy Milk";
      static  double weightGrams = 60.0;
      static  double price = 2.5; // in USD
      static  boolean isMilkChocolate = true;
      static  boolean containsNuts = false;
      static  String flavor = "Milk Chocolate";
      static  int calories = 250;
      static  String packagingColor = "Purple";
 public static void main(String[] args) {
        String brand = "Culfi";
        String productName = "Dark Milk";
        double weightGrams = 30.0;
        double price = 2.5; // in USD
        boolean isMilkChocolate = true;
        boolean containsNuts = false;
        String flavor = "Milk Chocolate";
        int calories = 250;
        String packagingColor = "Purple";

        System.out.println("local variables");
  
        System.out.println("===== Dairy Milk Chocolate Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Product Name: " + productName);
        System.out.println("Weight: " + weightGrams + " grams");
        System.out.println("Price: $" + price);
        System.out.println("Milk Chocolate: " + isMilkChocolate);
        System.out.println("Contains Nuts: " + containsNuts);
        System.out.println("Flavor: " + flavor);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Packaging Color: " + packagingColor);
		
		
		
		System.out.println("static variables");
  
        System.out.println("===== Dairy Milk Chocolate Details =====");
        System.out.println("Brand: " +Dairymilk. brand);
        System.out.println("Product Name: " +Dairymilk. productName);
        System.out.println("Weight: " +Dairymilk. weightGrams + " grams");
        System.out.println("Price: $" +Dairymilk. price);
        System.out.println("Milk Chocolate: " +Dairymilk. isMilkChocolate);
        System.out.println("Contains Nuts: " +Dairymilk. containsNuts);
        System.out.println("Flavor: " +Dairymilk. flavor);
        System.out.println("Calories: " +Dairymilk. calories + " kcal");
        System.out.println("Packaging Color: " +Dairymilk. packagingColor);

    }
}
