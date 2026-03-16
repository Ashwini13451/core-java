class Smartphones {
    static String brand;
    static String model;
    static int storageGB;
    static int ramGB;
    static double price;
    static String color;
    static double screenSize;
    static int batteryMah;
    static boolean has5G;

    public static void main(String[] args) {
        brand = "Samsung";
        model = "Galaxy M14";
        storageGB = 128;
        ramGB = 6;
        price = 14999.0;
        color = "Blue";
        screenSize = 6.6;
        batteryMah = 6000;
        has5G = true;
		
        System.out.println("local variables");

        System.out.println("\nSmartphone Details:");
        System.out.println("Brand       : " + brand);
        System.out.println("Model       : " + model);
        System.out.println("Storage     : " + storageGB + " GB");
        System.out.println("RAM         : " + ramGB + " GB");
        System.out.println("Price       : ₹" + price);
        System.out.println("Color       : " + color);
        System.out.println("Screen Size : " + screenSize + " inches");
        System.out.println("Battery     : " + batteryMah + " mAh");
        System.out.println("5G Support  : " + has5G);
		
		System.out.println("static variables");

		System.out.println("\nSmartphone Details:");
        System.out.println("Brand       : " +Smartphones. brand);
        System.out.println("Model       : " + Smartphones.model);
        System.out.println("Storage     : " + Smartphones. storageGB + " GB");
        System.out.println("RAM         : " + Smartphones.ramGB + " GB");
        System.out.println("Price       : " + Smartphones. price);
        System.out.println("Color       : " + Smartphones. color);
        System.out.println("Screen Size : " + Smartphones.screenSize + " inches");
        System.out.println("Battery     : " + Smartphones.batteryMah + " mAh");
        System.out.println("5G Support  : " + Smartphones.has5G);

    }
}
