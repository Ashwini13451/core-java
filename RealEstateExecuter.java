class RealEstateExecuter {
    public static void main(String[] args) {

        // ----------- Object 1 -----------
        Property pr1 = new Property();
        pr1.propertyId = 1;
        pr1.propertyType = "Apartment";
        pr1.price = 7500000;
        pr1.available = true;
        pr1.location = "Whitefield";

        RealEstate re1 = new RealEstate();
        re1.realEstateId = 201;
        re1.companyName = "Prestige";
        re1.city = "Bangalore";
        re1.active = true;
        re1.property = pr1;
        re1.getRealEstateDetails();

        // ----------- Object 2 -----------
        Property pr2 = new Property();
        pr2.propertyId = 2;
        pr2.propertyType = "Villa";
        pr2.price = 15000000;
        pr2.available = true;
        pr2.location = "Sarjapur";

        RealEstate re2 = new RealEstate();
        re2.realEstateId = 202;
        re2.companyName = "Brigade";
        re2.city = "Bangalore";
        re2.active = true;
        re2.property = pr2;
        re2.getRealEstateDetails();

        // ----------- Object 3 -----------
        Property pr3 = new Property();
        pr3.propertyId = 3;
        pr3.propertyType = "Plot";
        pr3.price = 5000000;
        pr3.available = false;
        pr3.location = "Devanahalli";

        RealEstate re3 = new RealEstate();
        re3.realEstateId = 203;
        re3.companyName = "Sobha";
        re3.city = "Bangalore";
        re3.active = false;
        re3.property = pr3;
        re3.getRealEstateDetails();
    }
}