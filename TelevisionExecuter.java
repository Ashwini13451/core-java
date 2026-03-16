class TelevisionExecuter {
    public static void main(String[] args){
        System.out.println("Main started");

        System.out.println("Brand: " + Television.getBrand());
        System.out.println("Price: " + Television.getPrice());
        System.out.println("Screen Size: " + Television.getScreenSize() + " inch");
        System.out.println("Smart TV: " + Television.getSmartTV());
        System.out.println("Resolution: " + Television.getResolution());

        System.out.println("Main ended");
    }
}