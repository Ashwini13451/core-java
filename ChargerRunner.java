class ChargerRunner {

    public static void main(String[] args) {

        Charger c1 = new Charger();
        c1.chargerId = 1;
        c1.brand = "Samsung";
        c1.type = "Fast";

        Charger c2 = new Charger();
        c2.chargerId = 2;
        c2.brand = "Apple";
        c2.type = "Type-C";

        Charger c3 = new Charger();
        c3.chargerId = 3;
        c3.brand = "Mi";
        c3.type = "Fast";

        Charger c4 = new Charger();
        c4.chargerId = 4;
        c4.brand = "Realme";
        c4.type = "Normal";

        Charger c5 = new Charger();
        c5.chargerId = 5;
        c5.brand = "OnePlus";
        c5.type = "Fast";

        Charger c6 = new Charger();
        c6.chargerId = 6;
        c6.brand = "Vivo";
        c6.type = "Normal";

        Charger c7 = new Charger();
        c7.chargerId = 7;
        c7.brand = "Oppo";
        c7.type = "Fast";

        Charger c8 = new Charger();
        c8.chargerId = 8;
        c8.brand = "Nokia";
        c8.type = "Normal";

        Charger c9 = new Charger();
        c9.chargerId = 9;
        c9.brand = "Sony";
        c9.type = "Fast";

        Charger c10 = new Charger();
        c10.chargerId = 10;
        c10.brand = "LG";
        c10.type = "Type-C";

        Charger c11 = new Charger();
        c11.chargerId = 11;
        c11.brand = "Motorola";
        c11.type = "Fast";

        Charger c12 = new Charger();
        c12.chargerId = 12;
        c12.brand = "Asus";
        c12.type = "Normal";

        Charger c13 = new Charger();
        c13.chargerId = 13;
        c13.brand = "Lenovo";
        c13.type = "Fast";

        Charger c14 = new Charger();
        c14.chargerId = 14;
        c14.brand = "Huawei";
        c14.type = "Type-C";

        Charger c15 = new Charger();
        c15.chargerId = 15;
        c15.brand = "Google";
        c15.type = "Fast";

        Charger[] chargers = new Charger[15];

        chargers[0]=c1; chargers[1]=c2; chargers[2]=c3; chargers[3]=c4; chargers[4]=c5;
        chargers[5]=c6; chargers[6]=c7; chargers[7]=c8; chargers[8]=c9; chargers[9]=c10;
        chargers[10]=c11; chargers[11]=c12; chargers[12]=c13; chargers[13]=c14; chargers[14]=c15;

        for (Charger c : chargers) {
            System.out.println(c.chargerId);
            System.out.println(c.brand);
            System.out.println(c.type);
        }
    }
}