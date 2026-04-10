class DigitalZoneExecuter {

    public static void main(String[] a) {

        DigitalZone ref = new DigitalZone();

        boolean added = ref.addLaptopBrand("Dell");

        added = ref.addLaptopBrand("HP");
        System.out.println(added);

        added = ref.addLaptopBrand("Lenovo");
        added = ref.addLaptopBrand("Asus");
        added = ref.addLaptopBrand("Acer");
        added = ref.addLaptopBrand("Apple");

        // extra brand to check full condition
        added = ref.addLaptopBrand("Samsung");

        ref.getLaptopBrands();
    }
}