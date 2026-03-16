class GameConsoleExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = GameConsole.getBrand();
        System.out.println("The GameConsole brand is " + brand);

        double price = GameConsole.getPrice();
        System.out.println("The GameConsole price is " + price);

        String model = GameConsole.getModel();
        System.out.println("The GameConsole model is " + model);

        String storage = GameConsole.getStorage();
        System.out.println("Storage capacity: " + storage);

        boolean controller = GameConsole.getWirelessController();
        System.out.println("Wireless Controller available: " + controller);

        System.out.println("Main ended");
    }