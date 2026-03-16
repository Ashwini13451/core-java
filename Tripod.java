class Tripod{
    static String brand = "Digitek";
    static String model = "DTR 550 LW";
    static String material = "Aluminium";
    static double maxHeight = 165.0;   // in cm
    static double minHeight = 55.0;    // in cm
    static double weight = 1.5;        // in kg
    static double price = 2999.0;
    static boolean hasMobileHolder = true;
    static String color = "Black";

    public static void main(String[] args) {
        String brand = "AmazonBasics";
        String model = "WT-3130";
        String material = "Aluminum";
        double maxHeight = 150.0;
        double minHeight = 50.0;
        double weight = 1.2;
        double price = 1999.0;
        boolean hasMobileHolder = false;
        String color = "Silver";

        System.out.println("Local Variables");
        System.out.println("===== Tripod Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Material: " + material);
        System.out.println("Max Height: " + maxHeight + " cm");
        System.out.println("Min Height: " + minHeight + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: ₹" + price);
        System.out.println("Mobile Holder: " + hasMobileHolder);
        System.out.println("Color: " + color);

        System.out.println("\nStatic Variables");
        System.out.println("===== Tripod Details =====");
        System.out.println("Brand: " + Tripod.brand);
        System.out.println("Model: " + Tripod.model);
        System.out.println("Material: " + Tripod.material);
        System.out.println("Max Height: " + Tripod.maxHeight + " cm");
        System.out.println("Min Height: " + Tripod.minHeight + " cm");
        System.out.println("Weight: " + Tripod.weight + " kg");
        System.out.println("Price: ₹" + Tripod.price);
        System.out.println("Mobile Holder: " + Tripod.hasMobileHolder);
        System.out.println("Color: " + Tripod.color);
    }
}
