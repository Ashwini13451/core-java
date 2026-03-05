 class Laptop {
       static  String brand = "hp";
       static  String model = "XPS 18";
       static   String processor = "ADM";
       static  int ramGB = 8;
       static int storageGB = 512;
       static  double screenSizeInches = 15.6;
       static boolean isTouchscreen = true;
       static String operatingSystem = "Windows 11";
       static  double batteryLifeHours = 10.5;

public static void main(String[] args) {

        
        String brand = "Dell";
        String model = "XPS 15";
        String processor = "Intel Core i7";
        int ramGB = 16;
        int storageGB = 512;
        double screenSizeInches = 15.6;
        boolean isTouchscreen = true;
        String operatingSystem = "Windows 11";
        double batteryLifeHours = 10.5;

        System.out.println("local variables");

        System.out.println("===== Laptop Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("Screen Size: " + screenSizeInches + " inches");
        System.out.println("Touchscreen: " + isTouchscreen);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Battery Life: " + batteryLifeHours + " hours");
		
		
		System.out.println("static variables");

        System.out.println("===== Laptop Details =====");
        System.out.println("Brand: " +Laptop. brand);
        System.out.println("Model: " +Laptop. model);
        System.out.println("Processor: " +Laptop. processor);
        System.out.println("RAM: " +Laptop. ramGB + " GB");
        System.out.println("Storage: " +Laptop. storageGB + " GB");
        System.out.println("Screen Size: " +Laptop. screenSizeInches + " inches");
        System.out.println("Touchscreen: " +Laptop. isTouchscreen);
        System.out.println("Operating System: " +Laptop. operatingSystem);

    }
}
