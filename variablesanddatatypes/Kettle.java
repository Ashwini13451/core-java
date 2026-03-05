class Kettle {
    static String brand = "Prestige";
    static String model = "PKOSS 1.5L";
    static String type = "Electric";
    static double capacity = 1.5;
    static int power = 1500;
    static String color = "Black";
    static double price = 2499.0;
    static boolean isAutoCut = true;
    static String material = "Stainless Steel";
public static void main(String[] args) {
        String brand = "Philips";
        String model = "HD9306";
        String type = "Electric";
        double capacity = 1.7;
        int power = 1800;
        String color = "Silver";
        double price = 2999.0;
        boolean isAutoCut = true;
        String material = "Steel";

        System.out.println("Local Variables");
        System.out.println("===== Kettle Details =====");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity + " L");
        System.out.println("Power: " + power + " W");
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Auto Cut: " + isAutoCut);
        System.out.println("Material: " + material);

        System.out.println("\nStatic Variables");
        System.out.println("===== Kettle Details =====");
        System.out.println("Brand: " + Kettle.brand);
        System.out.println("Model: " + Kettle.model);
        System.out.println("Type: " + Kettle.type);
        System.out.println("Capacity: " + Kettle.capacity + " L");
        System.out.println("Power: " + Kettle.power + " W");
        System.out.println("Color: " + Kettle.color);
        System.out.println("Price: ₹" + Kettle.price);
        System.out.println("Auto Cut: " + Kettle.isAutoCut);
        System.out.println("Material: " + Kettle.material);
    }
}


