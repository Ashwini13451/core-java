class FanExecuter{
  public static void main(String[] args){
  Fan fan = new Fan();
  fan.fanId=2;
  fan.fanBrand="Usha";
  fan.fanColour="White";
  fan.price=2500.00;
  
  
  
  Capacitor capacitor=new Capacitor();
  fan.capacitor=capacitor;
  
  capacitor.capacitorId=101;
  capacitor.brand="Havells";
  capacitor.capacity=2.5;
  capacitor.type="Motor capacity";
  capacitor.isWorking=true;
  fan.getFanDetails();
  
  
        // ----------- Object 1 -----------
        Fan fan1 = new Fan();
        fan1.fanId = 1;
        fan1.fanBrand = "Usha";
        fan1.fanColour = "White";
        fan1.price = 2500.00;

        Capacitor c1 = new Capacitor();
        c1.capacitorId = 101;
        c1.brand = "Havells";
        c1.capacity = 2.5;
        c1.type = "Motor";
        c1.isWorking = true;

        fan1.capacitor = c1;
        fan1.getFanDetails();

        // ----------- Object 2 -----------
        Fan fan2 = new Fan();
        fan2.fanId = 2;
        fan2.fanBrand = "Orient";
        fan2.fanColour = "Brown";
        fan2.price = 2200.00;

        Capacitor c2 = new Capacitor();
        c2.capacitorId = 102;
        c2.brand = "Bajaj";
        c2.capacity = 2.0;
        c2.type = "Motor";
        c2.isWorking = true;

        fan2.capacitor = c2;
        fan2.getFanDetails();

        // ----------- Object 3 -----------
        Fan fan3 = new Fan();
        fan3.fanId = 3;
        fan3.fanBrand = "Crompton";
        fan3.fanColour = "Black";
        fan3.price = 2800.00;

        Capacitor c3 = new Capacitor();
        c3.capacitorId = 103;
        c3.brand = "Usha";
        c3.capacity = 3.0;
        c3.type = "Motor";
        c3.isWorking = false;

        fan3.capacitor = c3;
        fan3.getFanDetails();

        // ----------- Object 4 -----------
        Fan fan4 = new Fan();
        fan4.fanId = 4;
        fan4.fanBrand = "Havells";
        fan4.fanColour = "Blue";
        fan4.price = 3000.00;

        Capacitor c4 = new Capacitor();
        c4.capacitorId = 104;
        c4.brand = "Orient";
        c4.capacity = 2.2;
        c4.type = "Motor";
        c4.isWorking = true;

        fan4.capacitor = c4;
        fan4.getFanDetails();

        // ----------- Object 5 -----------
        Fan fan5 = new Fan();
        fan5.fanId = 5;
        fan5.fanBrand = "Bajaj";
        fan5.fanColour = "Grey";
        fan5.price = 2100.00;

        Capacitor c5 = new Capacitor();
        c5.capacitorId = 105;
        c5.brand = "Crompton";
        c5.capacity = 2.8;
        c5.type = "Motor";
        c5.isWorking = true;

        fan5.capacitor = c5;
        fan5.getFanDetails();

        // ----------- Object 6 -----------
        Fan fan6 = new Fan();
        fan6.fanId = 6;
        fan6.fanBrand = "Orient";
        fan6.fanColour = "White";
        fan6.price = 2600.00;

        Capacitor c6 = new Capacitor();
        c6.capacitorId = 106;
        c6.brand = "Havells";
        c6.capacity = 2.3;
        c6.type = "Motor";
        c6.isWorking = false;

        fan6.capacitor = c6;
        fan6.getFanDetails();

        // ----------- Object 7 -----------
        Fan fan7 = new Fan();
        fan7.fanId = 7;
        fan7.fanBrand = "Usha";
        fan7.fanColour = "Red";
        fan7.price = 2700.00;

        Capacitor c7 = new Capacitor();
        c7.capacitorId = 107;
        c7.brand = "Bajaj";
        c7.capacity = 2.1;
        c7.type = "Motor";
        c7.isWorking = true;

        fan7.capacitor = c7;
        fan7.getFanDetails();

        // ----------- Object 8 -----------
        Fan fan8 = new Fan();
        fan8.fanId = 8;
        fan8.fanBrand = "Crompton";
        fan8.fanColour = "Silver";
        fan8.price = 2900.00;

        Capacitor c8 = new Capacitor();
        c8.capacitorId = 108;
        c8.brand = "Orient";
        c8.capacity = 2.6;
        c8.type = "Motor";
        c8.isWorking = true;

        fan8.capacitor = c8;
        fan8.getFanDetails();

        // ----------- Object 9 -----------
        Fan fan9 = new Fan();
        fan9.fanId = 9;
        fan9.fanBrand = "Havells";
        fan9.fanColour = "Green";
        fan9.price = 3100.00;

        Capacitor c9 = new Capacitor();
        c9.capacitorId = 109;
        c9.brand = "Usha";
        c9.capacity = 3.2;
        c9.type = "Motor";
        c9.isWorking = false;

        fan9.capacitor = c9;
        fan9.getFanDetails();

        // ----------- Object 10 -----------
        Fan fan10 = new Fan();
        fan10.fanId = 10;
        fan10.fanBrand = "Bajaj";
        fan10.fanColour = "Black";
        fan10.price = 2000.00;

        Capacitor c10 = new Capacitor();
        c10.capacitorId = 110;
        c10.brand = "Crompton";
        c10.capacity = 2.4;
        c10.type = "Motor";
        c10.isWorking = true;

        fan10.capacitor = c10;
        fan10.getFanDetails();

        // ----------- Object 11–20 (same pattern continued) -----------

        Fan fan11 = new Fan();
        fan11.fanId = 11;
        fan11.fanBrand = "Usha";
        fan11.fanColour = "White";
        fan11.price = 2500.00;

        Capacitor c11 = new Capacitor();
        c11.capacitorId = 111;
        c11.brand = "Havells";
        c11.capacity = 2.5;
        c11.type = "Motor";
        c11.isWorking = true;

        fan11.capacitor = c11;
        fan11.getFanDetails();

        Fan fan12 = new Fan();
        fan12.fanId = 12;
        fan12.fanBrand = "Orient";
        fan12.fanColour = "Brown";
        fan12.price = 2300.00;

        Capacitor c12 = new Capacitor();
        c12.capacitorId = 112;
        c12.brand = "Bajaj";
        c12.capacity = 2.2;
        c12.type = "Motor";
        c12.isWorking = true;

        fan12.capacitor = c12;
        fan12.getFanDetails();

        Fan fan13 = new Fan();
        fan13.fanId = 13;
        fan13.fanBrand = "Crompton";
        fan13.fanColour = "Black";
        fan13.price = 2800.00;

        Capacitor c13 = new Capacitor();
        c13.capacitorId = 113;
        c13.brand = "Usha";
        c13.capacity = 3.0;
        c13.type = "Motor";
        c13.isWorking = false;

        fan13.capacitor = c13;
        fan13.getFanDetails();

        Fan fan14 = new Fan();
        fan14.fanId = 14;
        fan14.fanBrand = "Havells";
        fan14.fanColour = "Blue";
        fan14.price = 3000.00;

        Capacitor c14 = new Capacitor();
        c14.capacitorId = 114;
        c14.brand = "Orient";
        c14.capacity = 2.3;
        c14.type = "Motor";
        c14.isWorking = true;

        fan14.capacitor = c14;
        fan14.getFanDetails();

        Fan fan15 = new Fan();
        fan15.fanId = 15;
        fan15.fanBrand = "Bajaj";
        fan15.fanColour = "Grey";
        fan15.price = 2100.00;

        Capacitor c15 = new Capacitor();
        c15.capacitorId = 115;
        c15.brand = "Crompton";
        c15.capacity = 2.7;
        c15.type = "Motor";
        c15.isWorking = true;

        fan15.capacitor = c15;
        fan15.getFanDetails();

        Fan fan16 = new Fan();
        fan16.fanId = 16;
        fan16.fanBrand = "Orient";
        fan16.fanColour = "White";
        fan16.price = 2600.00;

        Capacitor c16 = new Capacitor();
        c16.capacitorId = 116;
        c16.brand = "Havells";
        c16.capacity = 2.4;
        c16.type = "Motor";
        c16.isWorking = false;

        fan16.capacitor = c16;
        fan16.getFanDetails();

        Fan fan17 = new Fan();
        fan17.fanId = 17;
        fan17.fanBrand = "Usha";
        fan17.fanColour = "Red";
        fan17.price = 2700.00;

        Capacitor c17 = new Capacitor();
        c17.capacitorId = 117;
        c17.brand = "Bajaj";
        c17.capacity = 2.1;
        c17.type = "Motor";
        c17.isWorking = true;

        fan17.capacitor = c17;
        fan17.getFanDetails();

        Fan fan18 = new Fan();
        fan18.fanId = 18;
        fan18.fanBrand = "Crompton";
        fan18.fanColour = "Silver";
        fan18.price = 2900.00;

        Capacitor c18 = new Capacitor();
        c18.capacitorId = 118;
        c18.brand = "Orient";
        c18.capacity = 2.6;
        c18.type = "Motor";
        c18.isWorking = true;

        fan18.capacitor = c18;
        fan18.getFanDetails();

        Fan fan19 = new Fan();
        fan19.fanId = 19;
        fan19.fanBrand = "Havells";
        fan19.fanColour = "Green";
        fan19.price = 3100.00;

        Capacitor c19 = new Capacitor();
        c19.capacitorId = 119;
        c19.brand = "Usha";
        c19.capacity = 3.2;
        c19.type = "Motor";
        c19.isWorking = false;

        fan19.capacitor = c19;
        fan19.getFanDetails();

        Fan fan20 = new Fan();
        fan20.fanId = 20;
        fan20.fanBrand = "Bajaj";
        fan20.fanColour = "Black";
        fan20.price = 2000.00;

        Capacitor c20 = new Capacitor();
        c20.capacitorId = 120;
        c20.brand = "Crompton";
        c20.capacity = 2.4;
        c20.type = "Motor";
        c20.isWorking = true;

        fan20.capacitor = c20;
        fan20.getFanDetails();
    }
}
  
  