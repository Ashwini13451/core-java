class AdaptorRunner {

    public static void main(String[] args) {

        Adaptor a1 = new Adaptor();
        a1.adaptorId = 1;
        a1.brand = "Samsung";
        a1.type = "Fast Charging";

        Adaptor a2 = new Adaptor();
        a2.adaptorId = 2;
        a2.brand = "Apple";
        a2.type = "Type-C";

        Adaptor a3 = new Adaptor();
        a3.adaptorId = 3;
        a3.brand = "Mi";
        a3.type = "Fast Charging";

        Adaptor a4 = new Adaptor();
        a4.adaptorId = 4;
        a4.brand = "Realme";
        a4.type = "Normal";

        Adaptor a5 = new Adaptor();
        a5.adaptorId = 5;
        a5.brand = "OnePlus";
        a5.type = "Fast Charging";

        Adaptor a6 = new Adaptor();
        a6.adaptorId = 6;
        a6.brand = "Vivo";
        a6.type = "Normal";

        Adaptor a7 = new Adaptor();
        a7.adaptorId = 7;
        a7.brand = "Oppo";
        a7.type = "Fast Charging";

        Adaptor a8 = new Adaptor();
        a8.adaptorId = 8;
        a8.brand = "Nokia";
        a8.type = "Normal";

        Adaptor a9 = new Adaptor();
        a9.adaptorId = 9;
        a9.brand = "Sony";
        a9.type = "Fast Charging";

        Adaptor a10 = new Adaptor();
        a10.adaptorId = 10;
        a10.brand = "LG";
        a10.type = "Type-C";

        Adaptor a11 = new Adaptor();
        a11.adaptorId = 11;
        a11.brand = "Motorola";
        a11.type = "Fast Charging";

        Adaptor a12 = new Adaptor();
        a12.adaptorId = 12;
        a12.brand = "Asus";
        a12.type = "Normal";

        Adaptor a13 = new Adaptor();
        a13.adaptorId = 13;
        a13.brand = "Lenovo";
        a13.type = "Fast Charging";

        Adaptor a14 = new Adaptor();
        a14.adaptorId = 14;
        a14.brand = "Huawei";
        a14.type = "Type-C";

        Adaptor a15 = new Adaptor();
        a15.adaptorId = 15;
        a15.brand = "Google";
        a15.type = "Fast Charging";

        Adaptor[] adaptors = new Adaptor[15];

        adaptors[0] = a1;
        adaptors[1] = a2;
        adaptors[2] = a3;
        adaptors[3] = a4;
        adaptors[4] = a5;
        adaptors[5] = a6;
        adaptors[6] = a7;
        adaptors[7] = a8;
        adaptors[8] = a9;
        adaptors[9] = a10;
        adaptors[10] = a11;
        adaptors[11] = a12;
        adaptors[12] = a13;
        adaptors[13] = a14;
        adaptors[14] = a15;

        for (Adaptor a : adaptors) {
            System.out.println(a.adaptorId);
            System.out.println(a.brand);
            System.out.println(a.type);
        }
    }
}