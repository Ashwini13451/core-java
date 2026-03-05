class Keyboard {
       static String brand = "Logitech";
       static String model = "K380";
       static String type = "Wireless";
       static boolean isMechanical = false;
       static int numberOfKeys = 79;
       static boolean hasBacklight = true;
       static String connectionType = "Bluetooth";
       static double weightGrams = 423.5;
       static String color = "Black";


    public static void main(String[] args) {
        String brand = "Logitech";
        String model = "K380";
        String type = "Wireless";
        boolean isMechanical = false;
        int numberOfKeys = 79;
        boolean hasBacklight = true;
        String connectionType = "Bluetooth";
        double weightGrams = 423.5;
        String color = "Black";

        System.out.println("local varaibles");

        System.out.println("===== Keyboard Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Mechanical: " + isMechanical);
        System.out.println("Number of Keys: " + numberOfKeys);
        System.out.println("Backlight: " + hasBacklight);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Weight: " + weightGrams + " grams");
        System.out.println("Color: " + color);
		
	    System.out.println("static varaibles");
	
		System.out.println("===== Keyboard Details =====");
        System.out.println("Brand is: " +Keyboard. brand);
        System.out.println("Model is: " + Keyboard.model);
        System.out.println("Type is: " +Keyboard. type);
        System.out.println("Mechanical: " + Keyboard.isMechanical);
        System.out.println("Number of Keys is: " +Keyboard.numberOfKeys);
        System.out.println("Backlight is: " +Keyboard.hasBacklight);
        System.out.println("Connection Type is: " +Keyboard.connectionType);
        System.out.println("Weightis: " +Keyboard.weightGrams + " grams");
        System.out.println("Color is:  " +Keyboard.color);

    }
}
