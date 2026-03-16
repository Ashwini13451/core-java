class Yogamat {
    static String brand= "notboldfit";
    static String color= "white";
    static double length= 187.0;
    static double width= 76.0;
    static double thickness=6.0;
    static String material="good";
    static double price= 999.0;
    static boolean ecoFriendly= true;
    static boolean nonSlip= true;

    public static void main(String[] args) {

        brand = "Boldfit";
        color = "Purple";
        length = 183.0;      
        width = 61.0;       
        thickness = 6.0;    
        material = "TPE";
        price = 999.0;
        ecoFriendly = true;
        nonSlip = true;
		
        System.out.println("local variables");

        System.out.println("\nYoga Mat Details:");
        System.out.println("Brand        : " + brand);
        System.out.println("Color        : " + color);
        System.out.println("Length       : " + length + " cm");
        System.out.println("Width        : " + width + " cm");
        System.out.println("Thickness    : " + thickness + " mm");
        System.out.println("Material     : " + material);
        System.out.println("Price        : ₹" + price);
        System.out.println("Eco Friendly : " + ecoFriendly);
        System.out.println("Non-Slip     : " + nonSlip);
		
		System.out.println("static variables");

        System.out.println("\nYoga Mat Details:");
        System.out.println("Brand        : " +Yogamat. brand);
        System.out.println("Color        : " +Yogamat.color);
        System.out.println("Length       : " +Yogamat. length + " cm");
        System.out.println("Width        : " + Yogamat.width + " cm");
        System.out.println("Thickness    : " +Yogamat. thickness + " mm");
        System.out.println("Material     : " +Yogamat. material);
        System.out.println("Price        : ₹" +Yogamat. price);
        System.out.println("Eco Friendly : " +Yogamat. ecoFriendly);
        System.out.println("Non-Slip     : " +Yogamat. nonSlip);
    }
}
