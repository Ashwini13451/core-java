public class Smartwatch {       
       static String brand = "Apple";
       static String model = "Watch Series 9";
       static double price = 399.99;
       static String color = "Midnight Black";
       static double screenSize = 1.9;  
       static int batteryLife = 18;   
       static boolean waterResistant = true;
       static boolean heartRateMonitor = true;
       static boolean bluetoothEnabled = true;


    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Watch Series 9";
        double price = 399.99;
        String color = "Midnight Black";
        double screenSize = 1.9;  
        int batteryLife = 18;   
        boolean waterResistant = true;
        boolean heartRateMonitor = true;
        boolean bluetoothEnabled = true;

        System.out.println("local variables");  
        System.out.println("Smart Watch Details");
        System.out.println("-------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Water Resistant: " + waterResistant);
        System.out.println("Heart Rate Monitor: " + heartRateMonitor);
        System.out.println("Bluetooth Enabled: " + bluetoothEnabled);
		
		System.out.println("static variables");
	    System.out.println("Smart Watch Details");
        System.out.println("-------------------");
        System.out.println("Brand: " +Smartwatch. brand);
        System.out.println("Model: " +Smartwatch. model);
        System.out.println("Price: $" +Smartwatch. price);
        System.out.println("Color: " + Smartwatch.color);
        System.out.println("Screen Size: " + Smartwatch.screenSize + " inches");
        System.out.println("Battery Life: " + Smartwatch.batteryLife + " hours");
        System.out.println("Water Resistant: " +Smartwatch. waterResistant);
        System.out.println("Heart Rate Monitor: " +Smartwatch. heartRateMonitor);
        System.out.println("Bluetooth Enabled: " +Smartwatch. bluetoothEnabled);

    }
}