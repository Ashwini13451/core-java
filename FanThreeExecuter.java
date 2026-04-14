class FanThreeExecuter {
    public static void main(String[] args) {
        Capacitor capacitor = new Capacitor();
        capacitor.capacitorId = 203;
        capacitor.type = "Ceramic";
        capacitor.capacity = "1.5uF";

        Fan fan = new Fan(103, "Orient", "Exhaust", capacitor);
        fan.getFanDetails();
    }
}