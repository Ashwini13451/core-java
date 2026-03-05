class WaterPurifier {
    static String brand = "AquaGuard";
    static String model = "Enhance RO+UV";
    static String purificationType = "RO + UV";
    static int capacity = 10;
    static int filterLife = 12;
    static double price = 8999.0;
    static boolean hasStorageTank = true;
    static String color = "White";
    static double waterQuality = 250.0;

    public static void main(String[] args) {
        String brand = "Kent";
        String model = "Grand Plus";
        String purificationType = "RO + UF";
        int capacity = 8;
        int filterLife = 10;
        double price = 10500.0;
        boolean hasStorageTank = true;
        String color = "Black";
        double waterQuality = 300.0;

        System.out.println("Local Variables");
        System.out.println("===== Water Purifier Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Purification Type: " + purificationType);
        System.out.println("Capacity: " + capacity + " L");
        System.out.println("Filter Life: " + filterLife + " months");
        System.out.println("Price: ₹" + price);
        System.out.println("Storage Tank: " + hasStorageTank);
        System.out.println("Color: " + color);
        System.out.println("Water Quality (TDS): " + waterQuality);

        System.out.println("Static Variables");
        System.out.println("===== Water Purifier Details =====");
        System.out.println("Brand: " + WaterPurifier.brand);
        System.out.println("Model: " + WaterPurifier.model);
        System.out.println("Purification Type: " + WaterPurifier.purificationType);
        System.out.println("Capacity: " + WaterPurifier.capacity + " L");
        System.out.println("Filter Life: " + WaterPurifier.filterLife + " months");
        System.out.println("Price: ₹" + WaterPurifier.price);
        System.out.println("Storage Tank: " + WaterPurifier.hasStorageTank);
        System.out.println("Color: " + WaterPurifier.color);
        System.out.println("Water Quality (TDS): " + WaterPurifier.waterQuality);
    }
}
