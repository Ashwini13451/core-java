class MixerExecuter {

    public static void main(String[] product){

        System.out.println("Main started");

        String brand = Mixer.getBrand();
        System.out.println("The Mixer brand is " + brand);

        double price = Mixer.getprice();
        System.out.println("The Mixer price is " + price);

        String colour = Mixer.getColour();
        System.out.println("The Mixer colour is " + colour);

        boolean motor = Mixer.getPowerfulMotor();
        System.out.println("Powerful motor available: " + motor);

        double capacity = Mixer.getJarCapacity();
        System.out.println("The Mixer jar capacity is " + capacity + " liters");

        System.out.println("Main ended");
    }
}


