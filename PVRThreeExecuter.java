class PVRThreeExecuter {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.screenId = 103;
        screen.screenType = "Standard";
        screen.capacity = 200;

        PVR pvr = new PVR(3, "PVR Garuda Mall", "Bengaluru", screen);
        pvr.getPVRDetails();
    }
}