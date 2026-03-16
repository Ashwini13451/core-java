class Refrigerator {

    public static String getBrand(){
        System.out.println("getBrand() invoked");
        return "Whirlpool";
    }

    public static double getprice(){
        System.out.println("getprice() invoked");
        return 40000;
    }

    public static String getColour(){
        System.out.println("getColour() invoked");
        return "Silver";
    }

    public static boolean getFrostFree(){
        System.out.println("getFrostFree() invoked");
        return true;
    }

    public static double getCapacity(){
        System.out.println("getCapacity() invoked");
        return 300;   // in liters
    }
}