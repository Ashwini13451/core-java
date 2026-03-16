class BluetoothAdaptorExecuter {

    public static void main(String[] args){

        System.out.println("Main started");

        String brand = BluetoothAdaptor.getBrand();
        System.out.println("The BluetoothAdaptor brand is " + brand);

        double price = BluetoothAdaptor.getPrice();
        System.out.println("The BluetoothAdaptor price is " + price);

        String colour = BluetoothAdaptor.getColour();
        System.out.println("The BluetoothAdaptor colour is " + colour);

        String version = BluetoothAdaptor.getVersion();
        System.out.println("Bluetooth version: " + version);

        boolean compatible = BluetoothAdaptor.getCompatibility();
        System.out.println("Device compatible: " + compatible);

        System.out.println("Main ended");
    }
}