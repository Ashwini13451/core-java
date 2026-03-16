class FitnessBand {

    public static String getBrand(){
        System.out.println("getBrand() invoked");
        return "Fitbit";
    }

    public static double getPrice(){
        System.out.println("getPrice() invoked");
        return 7999;
    }

    public static String getColour(){
        System.out.println("getColour() invoked");
        return "Black";
    }

    public static int getBatteryLife(){
        System.out.println("getBatteryLife() invoked");
        return 7; // days
    }

    public static boolean getHeartRateMonitor(){
        System.out.println("getHeartRateMonitor() invoked");
        return true;
    }
}

