class PowerBankExecuter {

    public static void main(String[] product){

        System.out.println("Main started");

        String brand = PowerBank.getBrand();
        System.out.println("The PowerBank brand is " + brand);

        double price = PowerBank.getprice();
        System.out.println("The PowerBank price is " + price);

        String colour = PowerBank.getColour();
        System.out.println("The PowerBank colour is " + colour);

        boolean capability = PowerBank.getFastChargingCapability();
        System.out.println("The Fast Charging capability is " + capability);

        double weight = PowerBank.getWeight();
        System.out.println("The PowerBank weight is " + weight);

        System.out.println("Main ended");
    }
}