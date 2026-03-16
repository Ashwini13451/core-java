class PhoneExecuter {

    public static void main(String[] product){

        System.out.println("Main started");

        String brand = Phone.getBrand();
        System.out.println("The Phone brand is " + brand);

        double price = Phone.getprice();
        System.out.println("The Phone price is " + price);

        String colour = Phone.getColour();
        System.out.println("The Phone colour is " + colour);

        boolean capability = Phone.get5GCapability();
        System.out.println("The 5G capability is " + capability);

        double weight = Phone.getWeight();
        System.out.println("The Phone weight is " + weight);

        System.out.println("Main ended");
    }
}