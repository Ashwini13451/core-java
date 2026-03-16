class RefrigeratorExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = Refrigerator.getBrand();
        System.out.println("The Refrigerator brand is " + brand);

        double price = Refrigerator.getprice();
        System.out.println("The Refrigerator price is " + price);

        String colour = Refrigerator.getColour();
        System.out.println("The Refrigerator colour is " + colour);

        boolean frostFree = Refrigerator.getFrostFree();
        System.out.println("Frost Free: " + frostFree);

        double capacity = Refrigerator.getCapacity();
        System.out.println("The Refrigerator capacity is " + capacity + " liters");

        System.out.println("Main ended");
    }
}


