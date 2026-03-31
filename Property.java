class Property {
    int propertyId;
    String propertyType;
    double price;
    boolean available;
    String location;

    public void getPropertyDetails() {
        System.out.println("Property Id: " + propertyId);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
        System.out.println("Location: " + location);
    }
}