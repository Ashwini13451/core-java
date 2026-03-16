class MouseExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = Mouse.getBrand();
        System.out.println("The Mouse brand is " + brand);

        double price = Mouse.getPrice();
        System.out.println("The Mouse price is " + price);

        String colour = Mouse.getColour();
        System.out.println("The Mouse colour is " + colour);

        boolean wireless = Mouse.getWireless();
        System.out.println("Wireless available: " + wireless);

        int dpi = Mouse.getDPI();
        System.out.println("The Mouse DPI is " + dpi);

        System.out.println("Main ended");
    }
}

