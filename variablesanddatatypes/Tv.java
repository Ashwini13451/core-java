public class Tv {
	   static  String brand = "sony";
       static String model = "QLED Q80A";
       static double screenSizeInches = 58.0;
       static  String resolution = "5K UHD";
       static boolean isSmartTV = true;
       static boolean hasHDR = true;
       static  int speakers = 3;
       static String connectionType = "HDMI/Wi-Fi";
       static double price = 899.99;
 public static void main(String[] args) {
        String brand = "Samsung";
        String model = "QLED Q80A";
        double screenSizeInches = 55.0;
        String resolution = "4K UHD";
        boolean isSmartTV = true;
        boolean hasHDR = true;
        int speakers = 2;
        String connectionType = "HDMI/Wi-Fi";
        double price = 799.99;

        System.out.println("local variables");

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInches + " inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Smart TV: " + isSmartTV);
        System.out.println("HDR Support: " + hasHDR);
        System.out.println("Number of Speakers: " + speakers);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Price: $" + price);
		
	 System.out.println("static variables");

		System.out.println("===== TV Details =====");
        System.out.println("Brand: " +Tv. brand);
        System.out.println("Model: " +Tv. model);
        System.out.println("Screen Size: " +Tv. screenSizeInches + " inches");
        System.out.println("Resolution: " +Tv. resolution);
        System.out.println("Smart TV: " +Tv. isSmartTV);
        System.out.println("HDR Support: " +Tv. hasHDR);
        System.out.println("Number of Speakers: " +Tv. speakers);
        System.out.println("Connection Type: " +Tv. connectionType);
        System.out.println("Price: $" +Tv. price);
}
}