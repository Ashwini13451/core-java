class DoorExecuter {
    public static void main(String[] args) {

        // ----------- Object 1 -----------
        Lock l1 = new Lock();
        l1.lockId = 1;
        l1.type = "Digital";
        l1.isSecure = true;
        l1.brand = "Godrej";
        l1.pin = 1234;

        Door d1 = new Door();
        d1.doorId = 201;
        d1.material = "Wood";
        d1.color = "Brown";
        d1.open = false;
        d1.lock = l1;
        d1.getDoorDetails();

        // ----------- Object 2 -----------
        Lock l2 = new Lock();
        l2.lockId = 2;
        l2.type = "Manual";
        l2.isSecure = true;
        l2.brand = "Samsung";
        l2.pin = 5678;

        Door d2 = new Door();
        d2.doorId = 202;
        d2.material = "Steel";
        d2.color = "Grey";
        d2.open = true;
        d2.lock = l2;
        d2.getDoorDetails();

        // ----------- Object 3 -----------
        Lock l3 = new Lock();
        l3.lockId = 3;
        l3.type = "Smart";
        l3.isSecure = false;
        l3.brand = "Yale";
        l3.pin = 9999;

        Door d3 = new Door();
        d3.doorId = 203;
        d3.material = "Fiber";
        d3.color = "White";
        d3.open = false;
        d3.lock = l3;
        d3.getDoorDetails();
    }
}