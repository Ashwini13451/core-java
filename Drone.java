class Drone {

    public static String getBrand(){
        System.out.println("getBrand() invoked");
        return "DJI";
    }

    public static double getPrice(){
        System.out.println("getPrice() invoked");
        return 85000;
    }

    public static String getColour(){
        System.out.println("getColour() invoked");
        return "White";
    }

    public static double getRange(){
        System.out.println("getRange() invoked");
        return 10; // km
    }

    public static boolean getCameraSupport(){
        System.out.println("getCameraSupport() invoked");
        return true;
    }
}

