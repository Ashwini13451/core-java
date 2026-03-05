public class Headset {
       static String brand = "Sony";
       static String model = "WH-1000XM5";
       static  boolean isWireless = true;
       static  boolean hasNoiseCancellation = true;
       static  int batteryLifeHours = 30;
       static  double weightGrams = 250.5;
       static  String color = "Black";
       static   String connectionType = "Bluetooth";
       static double price = 349.99;


    public static void main(String[] args) {
        String brand = "boat";
        String model = "WH-1000XM5";
        boolean isWireless = true;
        boolean hasNoiseCancellation = true;
        int batteryLifeHours = 40;
        double weightGrams = 250.5;
        String color = "white";
        String connectionType = "Bluetooth";
        double price = 349.99;

        System.out.println("local variables");

        System.out.println("===== Headset Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Noise Cancellation: " + hasNoiseCancellation);
        System.out.println("Battery Life: " + batteryLifeHours + " hours");
        System.out.println("Weight: " + weightGrams + " grams");
        System.out.println("Color: " + color);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Price: $" + price);
		
		
		System.out.println("static variables");

        System.out.println("===== Headset Details =====");
        System.out.println("Brand: " +Headset. brand);
        System.out.println("Model: " +Headset. model);
        System.out.println("Wireless: " +Headset. isWireless);
        System.out.println("Noise Cancellation: " +Headset. hasNoiseCancellation);
        System.out.println("Battery Life: " +Headset. batteryLifeHours + " hours");
        System.out.println("Weight: " + Headset.weightGrams + " grams");
        System.out.println("Color: " + Headset.color);
        System.out.println("Connection Type: " +Headset. connectionType);
        System.out.println("Price: $" +Headset. price);
    }
}
