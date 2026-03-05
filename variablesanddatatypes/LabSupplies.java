class LabSupplies {

    // Static Variables
    static String itemName = "Beaker";
    static String brand = "Borosil";
    static String material = "Glass";
    static int quantity = 50;
    static double pricePerItem = 120.0;
    static String labType = "Chemistry";
    static boolean isSterile = true;
    static String size = "500ml";
    static String supplier = "LabTech Pvt Ltd";

    public static void main(String[] args) {

        // Local Variables
        String itemName = "Test Tube";
        String brand = "GlassCo";
        String material = "Glass";
        int quantity = 100;
        double pricePerItem = 25.0;
        String labType = "Biology";
        boolean isSterile = false;
        String size = "15ml";
        String supplier = "ScienceWorld Suppliers";

        System.out.println("Local Variables");
        System.out.println("===== Lab Supplies Details =====");
        System.out.println("Item Name: " + itemName);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: ₹" + pricePerItem);
        System.out.println("Lab Type: " + labType);
        System.out.println("Sterile: " + isSterile);
        System.out.println("Size: " + size);
        System.out.println("Supplier: " + supplier);

        System.out.println("\nStatic Variables");
        System.out.println("===== Lab Supplies Details =====");
        System.out.println("Item Name: " + LabSupplies.itemName);
        System.out.println("Brand: " + LabSupplies.brand);
        System.out.println("Material: " + LabSupplies.material);
        System.out.println("Quantity: " + LabSupplies.quantity);
        System.out.println("Price Per Item: ₹" + LabSupplies.pricePerItem);
        System.out.println("Lab Type: " + LabSupplies.labType);
        System.out.println("Sterile: " + LabSupplies.isSterile);
        System.out.println("Size: " + LabSupplies.size);
        System.out.println("Supplier: " + LabSupplies.supplier);
    }
}
