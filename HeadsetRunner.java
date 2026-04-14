class HeadsetRunner {

    public static void main(String[] args) {

        Headset h1 = new Headset();
        h1.headsetId = 1;
        h1.brand = "Boat";
        h1.type = "Wired";

        Headset h2 = new Headset();
        h2.headsetId = 2;
        h2.brand = "JBL";
        h2.type = "Wireless";

        Headset h3 = new Headset();
        h3.headsetId = 3;
        h3.brand = "Sony";
        h3.type = "Bluetooth";

        Headset h4 = new Headset();
        h4.headsetId = 4;
        h4.brand = "Realme";
        h4.type = "Wired";

        Headset h5 = new Headset();
        h5.headsetId = 5;
        h5.brand = "OnePlus";
        h5.type = "Wireless";

        Headset h6 = new Headset();
        h6.headsetId = 6;
        h6.brand = "Samsung";
        h6.type = "Bluetooth";

        Headset h7 = new Headset();
        h7.headsetId = 7;
        h7.brand = "Apple";
        h7.type = "Wireless";

        Headset h8 = new Headset();
        h8.headsetId = 8;
        h8.brand = "Noise";
        h8.type = "Wired";

        Headset h9 = new Headset();
        h9.headsetId = 9;
        h9.brand = "Boult";
        h9.type = "Bluetooth";

        Headset h10 = new Headset();
        h10.headsetId = 10;
        h10.brand = "Skullcandy";
        h10.type = "Wireless";

        Headset h11 = new Headset();
        h11.headsetId = 11;
        h11.brand = "Philips";
        h11.type = "Wired";

        Headset h12 = new Headset();
        h12.headsetId = 12;
        h12.brand = "Panasonic";
        h12.type = "Bluetooth";

        Headset h13 = new Headset();
        h13.headsetId = 13;
        h13.brand = "LG";
        h13.type = "Wireless";

        Headset h14 = new Headset();
        h14.headsetId = 14;
        h14.brand = "Mi";
        h14.type = "Wired";

        Headset h15 = new Headset();
        h15.headsetId = 15;
        h15.brand = "Asus";
        h15.type = "Bluetooth";

        Headset[] headsets = new Headset[15];

        headsets[0]=h1; headsets[1]=h2; headsets[2]=h3; headsets[3]=h4; headsets[4]=h5;
        headsets[5]=h6; headsets[6]=h7; headsets[7]=h8; headsets[8]=h9; headsets[9]=h10;
        headsets[10]=h11; headsets[11]=h12; headsets[12]=h13; headsets[13]=h14; headsets[14]=h15;

        for (Headset h : headsets) {
            System.out.println(h.headsetId);
            System.out.println(h.brand);
            System.out.println(h.type);
        }
    }
}