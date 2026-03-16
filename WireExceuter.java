class WireExecuter {

    public static void main(String[] product){

        System.out.println("Main started");

        String brand = Wire.getBrand();
        System.out.println("The Wire brand is " + brand);

        double price = Wire.getprice();
        System.out.println("The Wire price is " + price);

        String colour = Wire.getColour();
        System.out.println("The Wire colour is " + colour);

        boolean copper = Wire.getCopperCore();
        System.out.println("Copper core available: " + copper);

        double length = Wire.getLength();
        System.out.println("The Wire length is " + length + " meters");

        System.out.println("Main ended");
    }
}