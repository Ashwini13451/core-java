class MobileRunner {

    public static void main(String[] args) {

        Mobile m1 = new Mobile(); m1.mobileId=1; m1.brand="Samsung"; m1.color="Black";
        Mobile m2 = new Mobile(); m2.mobileId=2; m2.brand="Apple"; m2.color="White";
        Mobile m3 = new Mobile(); m3.mobileId=3; m3.brand="OnePlus"; m3.color="Blue";
        Mobile m4 = new Mobile(); m4.mobileId=4; m4.brand="Vivo"; m4.color="Red";
        Mobile m5 = new Mobile(); m5.mobileId=5; m5.brand="Oppo"; m5.color="Green";
        Mobile m6 = new Mobile(); m6.mobileId=6; m6.brand="Nokia"; m6.color="Black";
        Mobile m7 = new Mobile(); m7.mobileId=7; m7.brand="Realme"; m7.color="Yellow";
        Mobile m8 = new Mobile(); m8.mobileId=8; m8.brand="Motorola"; m8.color="Grey";
        Mobile m9 = new Mobile(); m9.mobileId=9; m9.brand="Sony"; m9.color="Purple";
        Mobile m10 = new Mobile(); m10.mobileId=10; m10.brand="LG"; m10.color="Pink";
        Mobile m11 = new Mobile(); m11.mobileId=11; m11.brand="Mi"; m11.color="Blue";
        Mobile m12 = new Mobile(); m12.mobileId=12; m12.brand="Huawei"; m12.color="White";
        Mobile m13 = new Mobile(); m13.mobileId=13; m13.brand="Asus"; m13.color="Black";
        Mobile m14 = new Mobile(); m14.mobileId=14; m14.brand="Lenovo"; m14.color="Silver";
        Mobile m15 = new Mobile(); m15.mobileId=15; m15.brand="Google"; m15.color="Black";

        Mobile[] mobiles = new Mobile[15];

        mobiles[0]=m1; mobiles[1]=m2; mobiles[2]=m3; mobiles[3]=m4; mobiles[4]=m5;
        mobiles[5]=m6; mobiles[6]=m7; mobiles[7]=m8; mobiles[8]=m9; mobiles[9]=m10;
        mobiles[10]=m11; mobiles[11]=m12; mobiles[12]=m13; mobiles[13]=m14; mobiles[14]=m15;

        for (Mobile m : mobiles) {
            System.out.println(m.mobileId);
            System.out.println(m.brand);
            System.out.println(m.color);
        }
    }
}