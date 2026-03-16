class IronBoxExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = IronBox.getBrand();
        System.out.println("The IronBox brand is " + brand);

        double price = IronBox.getprice();
        System.out.println("The IronBox price is " + price);

        String colour = IronBox.getColour();
        System.out.println("The IronBox colour is " + colour);

        boolean steam = IronBox.getSteamCapability();
        System.out.println("Steam function available: " + steam);

        double weight = IronBox.getWeight();
        System.out.println("The IronBox weight is " + weight + " kg");

        System.out.println("Main ended");
    }
}


