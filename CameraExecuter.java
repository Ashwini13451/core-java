class CameraExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = Camera.getBrand();
        System.out.println("The Camera brand is " + brand);

        double price = Camera.getPrice();
        System.out.println("The Camera price is " + price);

        String colour = Camera.getColour();
        System.out.println("The Camera colour is " + colour);

        boolean wifi = Camera.getWifiSupport();
        System.out.println("WiFi support available: " + wifi);

        double resolution = Camera.getResolution();
        System.out.println("The Camera resolution is " + resolution + " MP");

        System.out.println("Main ended");
    }
}