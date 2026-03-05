public class Bike{       
      static String brand = "Honda";
      static  String model = "CBR500R";
      static  int year = 2023;
      static  String color = "Red";
      static  double engineCapacityCC = 471.0;
      static  boolean isAutomatic = false;
      static  double mileageKmPerL = 25.5;
      static  String fuelType = "Petrol";
      static  double price = 6800.0;
 public static void main(String[] args) {
        String brand = "Royalenfield";
        String model = "CBR500R";
        int year = 2025;
        String color = "black";
        double engineCapacityCC = 471.0;
        boolean isAutomatic = false;
        double mileageKmPerL = 25.5;
        String fuelType = "Petrol";
        double price = 6800.0;
		
		
        System.out.println("local variables");

      
        System.out.println("===== Bike Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Engine Capacity: " + engineCapacityCC + " cc");
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Mileage: " + mileageKmPerL + " km/l");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: $" + price);
		
		
		System.out.println("static variables");

      
        System.out.println("===== Bike Details =====");
        System.out.println("Brand: " +Bike. brand);
        System.out.println("Model: " + Bike.model);
        System.out.println("Year: " +Bike. year);
        System.out.println("Color: " +Bike. color);
        System.out.println("Engine Capacity: " +Bike. engineCapacityCC + " cc");
        System.out.println("Automatic: " +Bike. isAutomatic);
        System.out.println("Mileage: " +Bike. mileageKmPerL + " km/l");
        System.out.println("Fuel Type: " +Bike. fuelType);
        System.out.println("Price: $" +Bike. price);

    }
}
