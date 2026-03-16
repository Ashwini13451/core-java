class Vacuumcleaner {
       static  String brand = "Dyson";
       static String model = "V15 Detect";
       static boolean isCordless = true;
       static int batteryLifeMinutes = 60;
       static double weightKg = 3.05;
       static String color = "Silver";
       static int suctionPowerPa = 23000; // Pascal
       static  boolean hasHEPAFilter = true;
       static double price = 699.99;
 public static void main(String[] args) {
        String brand = "Dyson";
        String model = "V15 Detect";
        boolean isCordless = true;
        int batteryLifeMinutes = 60;
        double weightKg = 3.05;
        String color = "Silver";
        int suctionPowerPa = 23000; // Pascal
        boolean hasHEPAFilter = true;
        double price = 699.99;
		
		System.out.println("local variables");
		System.out.println("===== Vacuum Cleaner Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Cordless: " + isCordless);
        System.out.println("Battery Life: " + batteryLifeMinutes + " minutes");
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Color: " + color);
        System.out.println("Suction Power: " + suctionPowerPa + " Pa");
        System.out.println("HEPA Filter: " + hasHEPAFilter);
        System.out.println("Price: $" + price);
		
		
		
	    System.out.println("static variables");

		
        System.out.println("===== Vacuum Cleaner Details =====");
        System.out.println("Brand: " +Vacuumcleaner. brand);
        System.out.println("Model: " +Vacuumcleaner. model);
        System.out.println("Cordless: " +Vacuumcleaner. isCordless);
        System.out.println("Battery Life: " +Vacuumcleaner. batteryLifeMinutes + " minutes");
        System.out.println("Weight: " +Vacuumcleaner. weightKg + " kg");
        System.out.println("Color: " +Vacuumcleaner. color);
        System.out.println("Suction Power: " +Vacuumcleaner. suctionPowerPa + " Pa");
        System.out.println("HEPA Filter: " +Vacuumcleaner. hasHEPAFilter);
        System.out.println("Price: $" +Vacuumcleaner. price);

    }
}
