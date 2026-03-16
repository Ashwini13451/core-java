class FitnessBandExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = FitnessBand.getBrand();
        System.out.println("The FitnessBand brand is " + brand);

        double price = FitnessBand.getPrice();
        System.out.println("The FitnessBand price is " + price);

        String colour = FitnessBand.getColour();
        System.out.println("The FitnessBand colour is " + colour);

        int battery = FitnessBand.getBatteryLife();
        System.out.println("Battery life: " + battery + " days");

        boolean heartRate = FitnessBand.getHeartRateMonitor();
        System.out.println("Heart Rate Monitor available: " + heartRate);

        System.out.println("Main ended");
    }
}