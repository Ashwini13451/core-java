class SmartBulbExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = SmartBulb.getBrand();
        System.out.println("The SmartBulb brand is " + brand);

        double price = SmartBulb.getPrice();
        System.out.println("The SmartBulb price is " + price);

        String colour = SmartBulb.getColour();
        System.out.println("The SmartBulb colour is " + colour);

        boolean wifi = SmartBulb.getWifiSupport();
        System.out.println("WiFi support available: " + wifi);

        String type = SmartBulb.getType();
        System.out.println("The SmartBulb type is " + type);

        System.out.println("Main ended");
    }
}