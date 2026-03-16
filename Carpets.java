class Carpets {

    // Static Variables
    static String brand = "Royal Carpets";
    static String material = "Wool";
    static String color = "Red";
    static double length = 10.0;     // in feet
    static double width = 8.0;       // in feet
    static double price = 7999.0;
    static String pattern = "Persian";
    static boolean isHandmade = true;
    static double thickness = 1.5;   // in inches

    public static void main(String[] args) {

        // Local Variables
        String brand = "HomeDecor";
        String material = "Nylon";
        String color = "Brown";
        double length = 12.0;
        double width = 9.0;
        double price = 5999.0;
        String pattern = "Modern";
        boolean isHandmade = false;
        double thickness = 1.0;

        System.out.println("Local Variables");
        System.out.println("===== Carpet Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " ft");
        System.out.println("Width: " + width + " ft");
        System.out.println("Price: ₹" + price);
        System.out.println("Pattern: " + pattern);
        System.out.println("Handmade: " + isHandmade);
        System.out.println("Thickness: " + thickness + " inches");

        System.out.println("\nStatic Variables");
        System.out.println("===== Carpet Details =====");
        System.out.println("Brand: " + Carpets.brand);
        System.out.println("Material: " + Carpets.material);
        System.out.println("Color: " + Carpets.color);
        System.out.println("Length: " + Carpets.length + " ft");
        System.out.println("Width: " + Carpets.width + " ft");
        System.out.println("Price: ₹" + Carpets.price);
        System.out.println("Pattern: " + Carpets.pattern);
        System.out.println("Handmade: " + Carpets.isHandmade);
        System.out.println("Thickness: " + Carpets.thickness + " inches");
    }
}
