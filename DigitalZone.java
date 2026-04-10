class DigitalZone {

    String laptopBrands[] = new String[6];
    int index;

    // create operation
    public boolean addLaptopBrand(String brand) {
        boolean isBrandAdded = false;

        if (index < laptopBrands.length) {

            if (brand != null && !brand.isEmpty()) {
                laptopBrands[index++] = brand;
                isBrandAdded = true;

            } else {
                System.out.println(brand + " not added");
            }

        } else {
            System.out.println("Laptop brands list is already full");
        }

        return isBrandAdded;
    }

    // read operation
    public void getLaptopBrands() {
        System.out.println("The available laptop brands are:");
        for (String brand : laptopBrands)
            System.out.println(brand);
    }
}