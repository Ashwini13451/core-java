class MobileExecuter{

public static void main(String[] args){
 
Sim sim = new Sim();
sim.simId=2;
sim.provider="Jio";
sim.network="5G";
sim.phoneNumber=9019922510L;
sim.active=true;

Mobile mobile=new Mobile();
mobile.mobileId=21;
mobile.brand="Nothing";
mobile.model="Nothing 2 pro";
mobile.switchOn=true;
mobile.sim=sim;
mobile.getMobileDetails();

//object1
Sim sim1 = new Sim();
        sim1.simId = 1;
        sim1.provider = "Jio";
        sim1.network = "5G";
        sim1.phoneNumber = 9000000001L;
        sim1.active = true;

        Mobile mobile1 = new Mobile();
        mobile1.mobileId = 101;
        mobile1.brand = "Samsung";
        mobile1.model = "Galaxy S21";
        mobile1.switchOn = true;
        mobile1.sim = sim1;
        mobile1.getMobileDetails();

        // ----------- Object 2 -----------
        Sim sim2 = new Sim();
        sim2.simId = 2;
        sim2.provider = "Airtel";
        sim2.network = "4G";
        sim2.phoneNumber = 9000000002L;
        sim2.active = true;

        Mobile mobile2 = new Mobile();
        mobile2.mobileId = 102;
        mobile2.brand = "Apple";
        mobile2.model = "iPhone 13";
        mobile2.switchOn = false;
        mobile2.sim = sim2;
        mobile2.getMobileDetails();

        // ----------- Object 3 -----------
        Sim sim3 = new Sim();
        sim3.simId = 3;
        sim3.provider = "Vi";
        sim3.network = "4G";
        sim3.phoneNumber = 9000000003L;
        sim3.active = false;

        Mobile mobile3 = new Mobile();
        mobile3.mobileId = 103;
        mobile3.brand = "OnePlus";
        mobile3.model = "Nord CE";
        mobile3.switchOn = true;
        mobile3.sim = sim3;
        mobile3.getMobileDetails();
		
		
		// ----------- Object 4 -----------
Sim sim4 = new Sim();
sim4.simId = 4;
sim4.provider = "Jio";
sim4.network = "5G";
sim4.phoneNumber = 9000000004L;
sim4.active = true;

Mobile mobile4 = new Mobile();
mobile4.mobileId = 104;
mobile4.brand = "Realme";
mobile4.model = "Narzo 50";
mobile4.switchOn = true;
mobile4.sim = sim4;
mobile4.getMobileDetails();

// ----------- Object 5 -----------
Sim sim5 = new Sim();
sim5.simId = 5;
sim5.provider = "Airtel";
sim5.network = "5G";
sim5.phoneNumber = 9000000005L;
sim5.active = true;

Mobile mobile5 = new Mobile();
mobile5.mobileId = 105;
mobile5.brand = "Xiaomi";
mobile5.model = "Redmi Note 11";
mobile5.switchOn = false;
mobile5.sim = sim5;
mobile5.getMobileDetails();

// ----------- Object 6 -----------
Sim sim6 = new Sim();
sim6.simId = 6;
sim6.provider = "Vi";
sim6.network = "4G";
sim6.phoneNumber = 9000000006L;
sim6.active = false;

Mobile mobile6 = new Mobile();
mobile6.mobileId = 106;
mobile6.brand = "Oppo";
mobile6.model = "F19";
mobile6.switchOn = true;
mobile6.sim = sim6;
mobile6.getMobileDetails();

// ----------- Object 7 -----------
Sim sim7 = new Sim();
sim7.simId = 7;
sim7.provider = "Jio";
sim7.network = "5G";
sim7.phoneNumber = 9000000007L;
sim7.active = true;

Mobile mobile7 = new Mobile();
mobile7.mobileId = 107;
mobile7.brand = "Vivo";
mobile7.model = "Y20";
mobile7.switchOn = true;
mobile7.sim = sim7;
mobile7.getMobileDetails();

// ----------- Object 8 -----------
Sim sim8 = new Sim();
sim8.simId = 8;
sim8.provider = "Airtel";
sim8.network = "4G";
sim8.phoneNumber = 9000000008L;
sim8.active = true;

Mobile mobile8 = new Mobile();
mobile8.mobileId = 108;
mobile8.brand = "Samsung";
mobile8.model = "Galaxy A52";
mobile8.switchOn = false;
mobile8.sim = sim8;
mobile8.getMobileDetails();

// ----------- Object 9 -----------
Sim sim9 = new Sim();
sim9.simId = 9;
sim9.provider = "Vi";
sim9.network = "4G";
sim9.phoneNumber = 9000000009L;
sim9.active = false;

Mobile mobile9 = new Mobile();
mobile9.mobileId = 109;
mobile9.brand = "Apple";
mobile9.model = "iPhone 12";
mobile9.switchOn = true;
mobile9.sim = sim9;
mobile9.getMobileDetails();

// ----------- Object 10 -----------
Sim sim10 = new Sim();
sim10.simId = 10;
sim10.provider = "Jio";
sim10.network = "5G";
sim10.phoneNumber = 9000000010L;
sim10.active = true;

Mobile mobile10 = new Mobile();
mobile10.mobileId = 110;
mobile10.brand = "OnePlus";
mobile10.model = "9R";
mobile10.switchOn = true;
mobile10.sim = sim10;
mobile10.getMobileDetails();

// ----------- Object 11 -----------
Sim sim11 = new Sim();
sim11.simId = 11;
sim11.provider = "Airtel";
sim11.network = "4G";
sim11.phoneNumber = 9000000011L;
sim11.active = true;

Mobile mobile11 = new Mobile();
mobile11.mobileId = 111;
mobile11.brand = "Samsung";
mobile11.model = "Galaxy M32";
mobile11.switchOn = true;
mobile11.sim = sim11;
mobile11.getMobileDetails();

// ----------- Object 12 -----------
Sim sim12 = new Sim();
sim12.simId = 12;
sim12.provider = "Vi";
sim12.network = "4G";
sim12.phoneNumber = 9000000012L;
sim12.active = false;

Mobile mobile12 = new Mobile();
mobile12.mobileId = 112;
mobile12.brand = "Realme";
mobile12.model = "Narzo 60";
mobile12.switchOn = false;
mobile12.sim = sim12;
mobile12.getMobileDetails();

// ----------- Object 13 -----------
Sim sim13 = new Sim();
sim13.simId = 13;
sim13.provider = "Jio";
sim13.network = "5G";
sim13.phoneNumber = 9000000013L;
sim13.active = true;

Mobile mobile13 = new Mobile();
mobile13.mobileId = 113;
mobile13.brand = "Xiaomi";
mobile13.model = "Redmi Note 12";
mobile13.switchOn = true;
mobile13.sim = sim13;
mobile13.getMobileDetails();

// ----------- Object 14 -----------
Sim sim14 = new Sim();
sim14.simId = 14;
sim14.provider = "Airtel";
sim14.network = "5G";
sim14.phoneNumber = 9000000014L;
sim14.active = true;

Mobile mobile14 = new Mobile();
mobile14.mobileId = 114;
mobile14.brand = "Oppo";
mobile14.model = "A78";
mobile14.switchOn = false;
mobile14.sim = sim14;
mobile14.getMobileDetails();

// ----------- Object 15 -----------
Sim sim15 = new Sim();
sim15.simId = 15;
sim15.provider = "Vi";
sim15.network = "4G";
sim15.phoneNumber = 9000000015L;
sim15.active = false;

Mobile mobile15 = new Mobile();
mobile15.mobileId = 115;
mobile15.brand = "Vivo";
mobile15.model = "Y56";
mobile15.switchOn = true;
mobile15.sim = sim15;
mobile15.getMobileDetails();

// ----------- Object 16 -----------
Sim sim16 = new Sim();
sim16.simId = 16;
sim16.provider = "Jio";
sim16.network = "5G";
sim16.phoneNumber = 9000000016L;
sim16.active = true;

Mobile mobile16 = new Mobile();
mobile16.mobileId = 116;
mobile16.brand = "Apple";
mobile16.model = "iPhone 14";
mobile16.switchOn = true;
mobile16.sim = sim16;
mobile16.getMobileDetails();

// ----------- Object 17 -----------
Sim sim17 = new Sim();
sim17.simId = 17;
sim17.provider = "Airtel";
sim17.network = "4G";
sim17.phoneNumber = 9000000017L;
sim17.active = true;

Mobile mobile17 = new Mobile();
mobile17.mobileId = 117;
mobile17.brand = "OnePlus";
mobile17.model = "Nord 2";
mobile17.switchOn = false;
mobile17.sim = sim17;
mobile17.getMobileDetails();

// ----------- Object 18 -----------
Sim sim18 = new Sim();
sim18.simId = 18;
sim18.provider = "Vi";
sim18.network = "4G";
sim18.phoneNumber = 9000000018L;
sim18.active = false;

Mobile mobile18 = new Mobile();
mobile18.mobileId = 118;
mobile18.brand = "Samsung";
mobile18.model = "Galaxy F23";
mobile18.switchOn = true;
mobile18.sim = sim18;
mobile18.getMobileDetails();

// ----------- Object 19 -----------
Sim sim19 = new Sim();
sim19.simId = 19;
sim19.provider = "Jio";
sim19.network = "5G";
sim19.phoneNumber = 9000000019L;
sim19.active = true;

Mobile mobile19 = new Mobile();
mobile19.mobileId = 119;
mobile19.brand = "Realme";
mobile19.model = "GT Neo";
mobile19.switchOn = true;
mobile19.sim = sim19;
mobile19.getMobileDetails();

// ----------- Object 20 -----------
Sim sim20 = new Sim();
sim20.simId = 20;
sim20.provider = "Airtel";
sim20.network = "5G";
sim20.phoneNumber = 9000000020L;
sim20.active = true;

Mobile mobile20 = new Mobile();
mobile20.mobileId = 120;
mobile20.brand = "Xiaomi";
mobile20.model = "Mi 11X";
mobile20.switchOn = false;
mobile20.sim = sim20;
mobile20.getMobileDetails();

}

}