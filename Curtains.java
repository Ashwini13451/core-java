class Curtains {

    // Static Variables
    static String brand = "HomeStyle";
    static String material = "Cotton";
    static String color = "Blue";
    static double length = 7.0;      // in feet
    static double width = 4.0;       // in feet
    static double price = 1499.0;
    static boolean isBlackout = true;
    static String pattern = "Floral";
    static int quantity = 2;

    public static void main(String[] args) {

        // Local Variables
        String brand = "Ikea";
        String material = "Polyester";
        String color = "Grey";
        double length = 6.5;
        double width = 3.5;
        double price = 999.0;
        boolean isBlackout = false;
        String pattern = "Plain";
        int quantity = 4;

        System.out.println("Local Variables");
        System.out.println("===== Curtains Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " ft");
        System.out.println("Width: " + width + " ft");
        System.out.println("Price: ₹" + price);
        System.out.println("Blackout: " + isBlackout);
        System.out.println("Pattern: " + pattern);
        System.out.println("Quantity: " + quantity);

        System.out.println("\nStatic Variables");
        System.out.println("===== Curtains Details =====");
        System.out.println("Brand: " + Curtains.brand);
        System.out.println("Material: " + Curtains.material);
        System.out.println("Color: " + Curtains.color);
        System.out.println("Length: " + Curtains.length + " ft");
        System.out.println("Width: " + Curtains.width + " ft");
        System.out.println("Price: ₹" + Curtains.price);
        System.out.println("Blackout: " + Curtains.isBlackout);
        System.out.println("Pattern: " + Curtains.pattern);
        System.out.println("Quantity: " + Curtains.quantity);
    }
}
