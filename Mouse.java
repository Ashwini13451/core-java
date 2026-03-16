 class Mouse {       
       static String brand = "Logitech";
       static  String model = "MX Master 3";
       static  boolean isWireless = true;
       static boolean hasBluetooth = true;
       static  int dpi = 4000;
       static   boolean isErgonomic = true;
       static   String color = "Graphite";
       static  int numberOfButtons = 7;
       static double price = 99.99;
public static void main(String[] args) {
       String brand = "Logitech";
        String model = "MX Master 3";
        boolean isWireless = true;
        boolean hasBluetooth = true;
        int dpi = 4000;
        boolean isErgonomic = true;
        String color = "Graphite";
        int numberOfButtons = 7;
        double price = 99.99;

     System.out.println("local varaiables");

        System.out.println("===== Mouse Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("DPI: " + dpi);
        System.out.println("Ergonomic: " + isErgonomic);
        System.out.println("Color: " + color);
        System.out.println("Number of Buttons: " + numberOfButtons);
        System.out.println("Price: $" + price);
		
		
		System.out.println("static variables");

        System.out.println("===== Mouse Details =====");
        System.out.println("Brand: " +Mouse. brand);
        System.out.println("Model: " +Mouse. model);
        System.out.println("Wireless: " +Mouse. isWireless);
        System.out.println("Bluetooth: " +Mouse. hasBluetooth);
        System.out.println("DPI: " +Mouse. dpi);
        System.out.println("Ergonomic: " +Mouse. isErgonomic);
        System.out.println("Color: " +Mouse. color);
        System.out.println("Number of Buttons: " +Mouse. numberOfButtons);
        System.out.println("Price: $" +Mouse. price);

    }
}
