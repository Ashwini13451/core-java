class PhoneSpecs {
	   static String operatingSystem = "Android 15";
       static  int ram = 6; 
       static double processorSpeed = 1.75; 
       static  int storage = 456; 
       static String colour = "Awesome Navy";
       static String simType = "Dual SIM (Nano)";
       static  String connectorType = "USB Type normal";
       static String biometricSecurity = "Fingerprint Recognition";
       static String waterResistance = "Water Resistant";
 public static void main(String[] args) {

        String operatingSystem = "Android 14";
        int ram = 8; 
        double processorSpeed = 2.75; 
        int storage = 256; 
        String colour = "Awesome Navy";
        String simType = "Dual SIM (Nano)";
        String connectorType = "USB Type C";
        String biometricSecurity = "Fingerprint Recognition";
        String waterResistance = "Water Resistant";
		 System.out.println("local variables");


        System.out.println("----- Phone Specifications -----");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor Speed: " + processorSpeed + " GHz");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Colour: " + colour);
        System.out.println("SIM Type: " + simType);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Biometric Security: " + biometricSecurity);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("---------------------------------");
		
		 System.out.println("static variables");

		System.out.println("----- Phone Specifications -----");
        System.out.println("Operating System: " +PhoneSpecs. operatingSystem);
        System.out.println("RAM: " +PhoneSpecs. ram + " GB");
        System.out.println("Processor Speed: " +PhoneSpecs. processorSpeed + " GHz");
        System.out.println("Storage: " +PhoneSpecs. storage + " GB");
        System.out.println("Colour: " +PhoneSpecs. colour);
        System.out.println("SIM Type: " +PhoneSpecs. simType);
        System.out.println("Connector Type: " +PhoneSpecs. connectorType);
        System.out.println("Biometric Security: " +PhoneSpecs. biometricSecurity);
        System.out.println("Water Resistance: " +PhoneSpecs. waterResistance);
        System.out.println("---------------------------------");

    }
}
