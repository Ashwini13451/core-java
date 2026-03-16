class LaptopExecuter {

    public static void main(String[] product){

        System.out.println("Main started");

        String brand = Laptop.getBrand();
        System.out.println("The Laptop brand is " + brand);

        double price = Laptop.getprice();
        System.out.println("The Laptop price is " + price);

        String colour = Laptop.getColour();
        System.out.println("The Laptop colour is " + colour);

        boolean capability = Laptop.getTouchScreenCapability();
        System.out.println("The TouchScreen capability is " + capability);

        double weight = Laptop.getWeight();
        System.out.println("The Laptop weight is " + weight);

        System.out.println("Main ended");
    }
}