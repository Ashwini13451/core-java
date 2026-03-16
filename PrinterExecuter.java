class PrinterExecuter {
    public static void main(String[] args){
        System.out.println("Main started");

        System.out.println("Brand: " + Printer.getBrand());
        System.out.println("Price: " + Printer.getPrice());
        System.out.println("Type: " + Printer.getType());
        System.out.println("Color Print: " + Printer.getColorPrint());
        System.out.println("Speed: " + Printer.getSpeed() + " ppm");

        System.out.println("Main ended");
    }
}