class DroneExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = Drone.getBrand();
        System.out.println("The Drone brand is " + brand);

        double price = Drone.getPrice();
        System.out.println("The Drone price is " + price);

        String colour = Drone.getColour();
        System.out.println("The Drone colour is " + colour);

        double range = Drone.getRange();
        System.out.println("Flying range: " + range + " km");

        boolean camera = Drone.getCameraSupport();
        System.out.println("Camera support available: " + camera);

        System.out.println("Main ended");
    }
}