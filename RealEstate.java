class RealEstate {
    int realEstateId;
    String companyName;
    String city;
    boolean active;
    Property property;

    public void getRealEstateDetails() {
        System.out.println("RealEstate Id: " + realEstateId);
        System.out.println("Company Name: " + companyName);
        System.out.println("City: " + city);
        System.out.println("Active: " + active);
        property.getPropertyDetails();
    }
}