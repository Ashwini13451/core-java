class LaptopRunner {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.laptopId = 1;
        l1.brand = "Dell";
        l1.processor = "i5";

        Laptop l2 = new Laptop();
        l2.laptopId = 2;
        l2.brand = "HP";
        l2.processor = "i7";

        Laptop l3 = new Laptop();
        l3.laptopId = 3;
        l3.brand = "Lenovo";
        l3.processor = "i3";

        Laptop l4 = new Laptop();
        l4.laptopId = 4;
        l4.brand = "Asus";
        l4.processor = "Ryzen 5";

        Laptop l5 = new Laptop();
        l5.laptopId = 5;
        l5.brand = "Acer";
        l5.processor = "i5";

        Laptop l6 = new Laptop();
        l6.laptopId = 6;
        l6.brand = "Apple";
        l6.processor = "M1";

        Laptop l7 = new Laptop();
        l7.laptopId = 7;
        l7.brand = "MSI";
        l7.processor = "i7";

        Laptop l8 = new Laptop();
        l8.laptopId = 8;
        l8.brand = "Samsung";
        l8.processor = "i5";

        Laptop l9 = new Laptop();
        l9.laptopId = 9;
        l9.brand = "LG";
        l9.processor = "i3";

        Laptop l10 = new Laptop();
        l10.laptopId = 10;
        l10.brand = "Sony";
        l10.processor = "i5";

        Laptop l11 = new Laptop();
        l11.laptopId = 11;
        l11.brand = "Toshiba";
        l11.processor = "i7";

        Laptop l12 = new Laptop();
        l12.laptopId = 12;
        l12.brand = "Huawei";
        l12.processor = "i5";

        Laptop l13 = new Laptop();
        l13.laptopId = 13;
        l13.brand = "Razer";
        l13.processor = "i9";

        Laptop l14 = new Laptop();
        l14.laptopId = 14;
        l14.brand = "Alienware";
        l14.processor = "i7";

        Laptop l15 = new Laptop();
        l15.laptopId = 15;
        l15.brand = "Microsoft";
        l15.processor = "i5";

        Laptop[] laptops = new Laptop[15];

        laptops[0] = l1;
        laptops[1] = l2;
        laptops[2] = l3;
        laptops[3] = l4;
        laptops[4] = l5;
        laptops[5] = l6;
        laptops[6] = l7;
        laptops[7] = l8;
        laptops[8] = l9;
        laptops[9] = l10;
        laptops[10] = l11;
        laptops[11] = l12;
        laptops[12] = l13;
        laptops[13] = l14;
        laptops[14] = l15;

        for (Laptop l : laptops) {
            System.out.println(l.laptopId);
            System.out.println(l.brand);
            System.out.println(l.processor);
        }
    }
}