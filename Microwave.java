    class Microwave{ 
	
	static String brand;
    static int capacity;          
    static int power;         
    static double price;
    static String type;          
    static boolean autoCookMenu;
    static int warrantyYears;
    static String color;
    static boolean childLock;
	
 public static void main(String[] args) {
        brand = "LG";
        capacity = 28;
        power = 900;
        price = 40000.00;
        type = "Convection";
        autoCookMenu = true;
        warrantyYears = 2;
        color = "Black";
        childLock = true; 
		
		System.out.println("local variables");
		
		System.out.println("Microwave Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Capacity : " + capacity);
        System.out.println("Power : " + power );
        System.out.println("Price : ₹" + price);
        System.out.println("Type : " + type);
        System.out.println("Auto Cook Menu : " + autoCookMenu);
        System.out.println("Warranty : " + warrantyYears);
        System.out.println("Color : " + color);
        System.out.println("Child Lock : " + childLock);
		
		
        System.out.println("static variables");
		
	    System.out.println("Microwave Details:");
        System.out.println("Brand : " +Microwave. brand);
        System.out.println("Capacity : " +Microwave. capacity );
        System.out.println("Power : " +Microwave. power );
        System.out.println("Price : ₹" +Microwave. price);
        System.out.println("Type : " + Microwave.type);
        System.out.println("Auto Cook Menu : " + Microwave.autoCookMenu);
        System.out.println("Warranty : " +Microwave. warrantyYears);
        System.out.println("Color : " +Microwave. color);
        System.out.println("Child Lock : " +Microwave.childLock);

    }
}
