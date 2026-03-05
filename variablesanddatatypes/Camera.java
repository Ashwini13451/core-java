class Camera {
      static String brand = "Canon";
      static String model = "EOS 1500D";
      static double megapixels = 24.1;
      static double  price = 38999.0;
      static String lensType = "18-55mm Lens";
      static boolean  hasWifi = true;
      static boolean  hasFlash = true;
      static int batteryCapacity = 1040;
      static String color = "Black";
public static void main(String[] args) {
       String brand = "Canon";
       String model = "EOS 1500D";
       double megapixels = 24.1;
       double  price = 38999.0;
       String lensType = "18-55mm Lens";
       boolean  hasWifi = true;
       boolean  hasFlash = true;
       int batteryCapacity = 1040;
       String color = "Black";
       System.out.println("static variables");
 
        System.out.println("\nCamera Details:");
        System.out.println("Brand            : " +Camera. brand);
        System.out.println("Model            : " + Camera.model);
        System.out.println("Megapixels       : " + Camera.megapixels + " MP");
        System.out.println("Price            : ₹" +Camera.price);
        System.out.println("Lens Type        : " +Camera. lensType);
        System.out.println("WiFi Available   : " +Camera. hasWifi);
        System.out.println("Flash Available  : " +Camera. hasFlash);
        System.out.println("Battery Capacity : " + Camera.batteryCapacity + " mAh");
        System.out.println("Color            : " + Camera.color);
		
		System.out.println("local variables");

		System.out.println("\nCamera Details:");
        System.out.println("Brand            : " + brand);
        System.out.println("Model            : " + model);
        System.out.println("Megapixels       : " + megapixels + " MP");
        System.out.println("Price            : ₹" + price);
        System.out.println("Lens Type        : " + lensType);
        System.out.println("WiFi Available   : " + hasWifi);
        System.out.println("Flash Available  : " + hasFlash);
        System.out.println("Battery Capacity : " + batteryCapacity + " mAh");
        System.out.println("Color            : " + color);

    }
}


