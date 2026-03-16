class TVExecuter {

    public static void main(String[] product){

        System.out.println("Main started");

        String brand = TV.getBrand();
        System.out.println("The TV brand is " + brand);

        double price = TV.getprice();
        System.out.println("The TV price is " + price);

        String colour = TV.getColour();
        System.out.println("The TV colour is " + colour);

        boolean smart = TV.getSmartTVCapability();
        System.out.println("Smart TV capability: " + smart);

        double size = TV.getScreenSize();
        System.out.println("The TV screen size is " + size + " inches");

        System.out.println("Main ended");
    }
}