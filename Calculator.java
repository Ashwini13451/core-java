class Calculator {

    // Static Variables
    static String brand = "Casio";
    static String model = "FX-991EX";
    static String type = "Scientific";
    static int batteryLife = 2;          // in years
    static double price = 1299.0;
    static String color = "Black";
    static boolean isSolarPowered = true;
    static int numberOfFunctions = 552;
    static String displayType = "LCD";

    public static void main(String[] args) {

        // Local Variables
        String brand = "Sharp";
        String model = "EL-W506";
        String type = "Scientific";
        int batteryLife = 3;
        double price = 1499.0;
        String color = "Grey";
        boolean isSolarPowered = false;
        int numberOfFunctions = 640;
        String displayType = "Digital LCD";

        System.out.println("Local Variables");
        System.out.println("===== Calculator Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Battery Life: " + batteryLife + " years");
        System.out.println("Price: ₹" + price);
        System.out.println("Color: " + color);
        System.out.println("Solar Powered: " + isSolarPowered);
        System.out.println("Number of Functions: " + numberOfFunctions);
        System.out.println("Display Type: " + displayType);

        System.out.println("\nStatic Variables");
        System.out.println("===== Calculator Details =====");
        System.out.println("Brand: " + Calculator.brand);
        System.out.println("Model: " + Calculator.model);
        System.out.println("Type: " + Calculator.type);
        System.out.println("Battery Life: " + Calculator.batteryLife + " years");
        System.out.println("Price: ₹" + Calculator.price);
        System.out.println("Color: " + Calculator.color);
        System.out.println("Solar Powered: " + Calculator.isSolarPowered);
        System.out.println("Number of Functions: " + Calculator.numberOfFunctions);
        System.out.println("Display Type: " + Calculator.displayType);
    }
}
