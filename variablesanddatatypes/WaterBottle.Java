class WaterBottle {
    static String brand="margon";
    static String color="white";
    static double capacity=2.0;
    static String material="steel";
    static double price=500.0;
    static boolean insulated= true;
    static boolean leakProof= false;
    static double height= 22.6;
    static double weight= 0.9;

    public static void main(String[] args) {

        brand = "Milton";
        color = "Blue";
        capacity = 1.0;   
        material = "Steel";
        price = 499.0;
        insulated = true;
        leakProof = true;
        height = 25.0;      
        weight = 0.5;       
	    System.out.println("local variables:");


        System.out.println("\nWater Bottle Details:");
        System.out.println("Brand       : " + brand);
        System.out.println("Color       : " + color);
        System.out.println("Capacity    : " + capacity + " L");
        System.out.println("Material    : " + material);
        System.out.println("Price       : ₹" + price);
        System.out.println("Insulated   : " + insulated);
        System.out.println("LeakProof  : " + leakProof);
        System.out.println("Height      : " + height + " cm");
        System.out.println("Weight      : " + weight + " kg");
		
	    System.out.println("static variables:");

		
	    System.out.println("\nWater Bottle Details:");
        System.out.println("Brand       : " +WaterBottle.brand);
        System.out.println("Color       : " +WaterBottle.color);
        System.out.println("Capacity    : " + WaterBottle.capacity + " L");
        System.out.println("Material    : " +WaterBottle.material);
        System.out.println("Price       : ₹" +WaterBottle.price);
        System.out.println("Insulated   : " +WaterBottle.insulated);
        System.out.println("LeakProof  : " +WaterBottle.leakProof);
        System.out.println("Height      : " +WaterBottle.height + " cm");
    }
	} 
