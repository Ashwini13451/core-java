class MicrowaveExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = Microwave.getBrand();
        System.out.println("The Microwave brand is " + brand);

        double price = Microwave.getprice();
        System.out.println("The Microwave price is " + price);

        String colour = Microwave.getColour();
        System.out.println("The Microwave colour is " + colour);

        boolean grill = Microwave.getGrillFunction();
        System.out.println("Grill function available: " + grill);

        double capacity = Microwave.getCapacity();
        System.out.println("The Microwave capacity is " + capacity + " liters");

        System.out.println("Main ended");
    }
}


